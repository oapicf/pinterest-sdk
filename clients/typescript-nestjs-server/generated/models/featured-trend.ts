import { TrendingTopic } from './trending-topic';
import { InterestsEnum } from './interests-enum';
import { ProductCategoryRegion } from './product-category-region';


/**
 * Featured trending topics for a specific interest and market
 */
export interface FeaturedTrend { 
  /**
   * The main interest category
   */
  interest: InterestsEnum;
  /**
   * Market code (e.g., \'US\', \'UK\', etc.)
   */
  market?: ProductCategoryRegion;
  /**
   * List of trending topics within this interest category
   */
  trends?: Array<TrendingTopic>;
}
export namespace FeaturedTrend {
}


