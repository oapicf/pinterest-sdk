import { TrendsAgeBucket } from './trends-age-bucket';


/**
 * This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 */
export interface TrendsAgeDistribution { 
  [key: string]: number | any;


  age_distribution?: TrendsAgeBucket;
}
export namespace TrendsAgeDistribution {
}


