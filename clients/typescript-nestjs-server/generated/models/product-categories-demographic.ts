import { GenderDemographics } from './gender-demographics';


/**
 * Age and gender distribution who engaged with this product category in the past 3 months
 */
export interface ProductCategoriesDemographic { 
  /**
   * Age demographic distribution
   */
  age: { [key: string]: number; };
  gender: GenderDemographics;
}

