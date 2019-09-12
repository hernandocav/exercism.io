import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List<String> rnaSplit = java.util.Arrays.asList(rnaSequence.split("(?<=\\G...)"));
        Set<String> retorno = new LinkedHashSet<String>();
        all:
        for (String var : rnaSplit) {            
            for (ProteinEnum e: ProteinEnum.values()) {
                if (e.name().equals(var)) {                                        
                    if (e.protein.equals("STOP")) { break all; }
                    retorno.add(e.protein); 
                    break;
                }              
            }
        }      
        retorno.removeAll(Collections.singleton(null));  
        return new ArrayList<String>(retorno);
    }

    enum ProteinEnum {
        AUG("Methionine"),
        UUU("Phenylalanine"),
        UUC("Phenylalanine"),
        UUA("Leucine"),
        UUG("Leucine"),
        UCU("Serine"),
        UCC("Serine"),
        UCA("Serine"),
        UCG("Serine"),
        UAU("Tyrosine"),
        UAC("Tyrosine"),
        UGU("Cysteine"),
        UGC("Cysteine"),
        UGG("Tryptophan"),
        UAA("STOP"),
        UAG("STOP"),
        UGA("STOP");

        ProteinEnum(String rna) { protein = rna; }
        public final String protein;        
    }
}