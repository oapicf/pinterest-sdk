import { ProductGroupPromotion } from './product-group-promotion';
import { Exception } from './exception';


export interface ProductGroupPromotionResponseItem { 
  data?: ProductGroupPromotion;
  exceptions?: Array<Exception>;
}

