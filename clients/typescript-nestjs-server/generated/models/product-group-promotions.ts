import { ProductGroupPromotionResponseItem } from './product-group-promotion-response-item';


/**
 * Wrapper model for ProductGroupPromotion.
 */
export interface ProductGroupPromotions { 
  /**
   * Response-only: created or updated product group promotions, or exceptions.
   */
  readonly items?: Array<ProductGroupPromotionResponseItem>;
}

