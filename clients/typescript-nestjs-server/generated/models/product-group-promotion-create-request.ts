import { ProductGroupPromotion } from './product-group-promotion';


export interface ProductGroupPromotionCreateRequest { 
  /**
   * ID of the Ad Group the Product Group Promotion belongs to.
   */
  ad_group_id: string;
  product_group_promotion: Array<ProductGroupPromotion>;
}

