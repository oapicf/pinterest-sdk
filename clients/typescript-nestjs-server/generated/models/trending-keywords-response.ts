import { TrendingKeyword } from './trending-keyword';


export interface TrendingKeywordsResponse { 
  /**
   * The top trending keywords for the specified trend type in the requested region. Results are ordered, with the first element in the array representing the #1 top trend.
   */
  trends?: Array<TrendingKeyword>;
}

