import { ProductCategoriesEngagementType } from './product-categories-engagement-type';


/**
 * Trending shopping product category
 */
export interface TrendingProductCategory { 
  /**
   * Engagement type
   */
  engagement_type: ProductCategoriesEngagementType;
  /**
   * Month-over-month change percentage
   */
  pct_change_mom: number;
  /**
   * Relative volume percentage
   */
  percent_relative_volume: number;
  /**
   * Pinterest Product Category Id
   */
  pinterest_product_category_id: number;
  /**
   * Product Category Name
   */
  product_category: string;
  /**
   * Vertical name associated with the product category
   */
  verticals?: Array<string>;
}
export namespace TrendingProductCategory {
}


