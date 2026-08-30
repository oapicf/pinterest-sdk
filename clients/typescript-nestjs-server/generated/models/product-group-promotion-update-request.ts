import { ProductGroupPromotion } from './product-group-promotion';


export interface ProductGroupPromotionUpdateRequest { 
  /**
   * ID of the ad group the product group belongs to.
   */
  ad_group_id: string;
  product_group_promotion: Array<ProductGroupPromotion>;
}

