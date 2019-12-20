//
// This is only a SKELETON file for the 'Resistor Color' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

const colorEnum = ["black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"];

export const colorCode = (color) => {  
  return colorEnum.indexOf(color);
};

export const COLORS = colorEnum;
