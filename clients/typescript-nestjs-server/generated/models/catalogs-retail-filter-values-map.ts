import { ProductAvailability } from './product-availability';
import { ProductCondition } from './product-condition';
import { MediaType } from './media-type';
import { Gender } from './gender';


/**
 * A map of filter attributes to their available values.
 */
export interface CatalogsRetailFilterValuesMap { 
  ad_image_tags?: Array<string>;
  ad_video_tags?: Array<string>;
  availability?: Array<ProductAvailability>;
  brand?: Array<string>;
  condition?: Array<ProductCondition>;
  custom_label_0?: Array<string>;
  custom_label_1?: Array<string>;
  custom_label_2?: Array<string>;
  custom_label_3?: Array<string>;
  custom_label_4?: Array<string>;
  gender?: Array<Gender>;
  google_product_category_0?: Array<string>;
  google_product_category_1?: Array<string>;
  google_product_category_2?: Array<string>;
  google_product_category_3?: Array<string>;
  google_product_category_4?: Array<string>;
  google_product_category_5?: Array<string>;
  google_product_category_6?: Array<string>;
  media_type?: Array<MediaType>;
  product_type_0?: Array<string>;
  product_type_1?: Array<string>;
  product_type_2?: Array<string>;
  product_type_3?: Array<string>;
  product_type_4?: Array<string>;
}

