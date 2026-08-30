import { ProductGroupPromotion } from './product-group-promotion';


/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */
export interface ProductGroupPromotionsUpdateWithRequiredBody { 
  /**
   * ID of the ad group the product group promotion belongs to.
   */
  ad_group_id: string;
  /**
   * List of product group promotions to create or update.
   */
  product_group_promotion: Array<ProductGroupPromotion>;
}

