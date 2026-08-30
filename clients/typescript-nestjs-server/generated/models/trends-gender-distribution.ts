import { TrendsGender } from './trends-gender';


/**
 * This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 */
export interface TrendsGenderDistribution { 
  [key: string]: number | any;


  gender_distribution?: TrendsGender;
}
export namespace TrendsGenderDistribution {
}


