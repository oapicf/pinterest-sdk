import { Promotion } from './promotion';


export interface PromotionsList200Response { 
  bookmark?: string | null;
  items: Array<Promotion>;
}

