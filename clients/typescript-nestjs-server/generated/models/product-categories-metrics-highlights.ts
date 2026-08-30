import { InnerProductCategoriesMetricsHighlights } from './inner-product-categories-metrics-highlights';


/**
 * Key performance metrics highlights for this product category
 */
export interface ProductCategoriesMetricsHighlights { 
  /**
   * Engagement metric value
   */
  engagement?: InnerProductCategoriesMetricsHighlights;
  /**
   * Number of outbound clicks
   */
  outbound_clicks?: InnerProductCategoriesMetricsHighlights;
  /**
   * Number of pin saves
   */
  pin_saves?: InnerProductCategoriesMetricsHighlights;
}

