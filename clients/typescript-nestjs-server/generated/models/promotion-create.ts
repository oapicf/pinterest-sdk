import { PromotionType } from './promotion-type';
import { DiscountStatus } from './discount-status';
import { PromotionTemplateValue } from './promotion-template-value';


/**
 * Resource create operation model.
 */
export interface PromotionCreate { 
  discount_status?: DiscountStatus;
  /**
   * Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
   */
  end_time?: number;
  /**
   * Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
   */
  external_id?: string;
  /**
   * The source integration platform used when creating the promotion. Currently supported values are \'DEFAULT\' and \'SHOPIFY\'.
   */
  platform_type?: string;
  /**
   * Code that can be used to redeem a promotion.
   */
  promotion_code?: string;
  /**
   * An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
   */
  promotion_custom_id?: string;
  /**
   * Internal name for the promotion.
   */
  promotion_title: string;
  promotion_type: PromotionType;
  /**
   * Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
   */
  start_time?: number;
  /**
   * List of values to be inserted in the promotion type-specific template.
   */
  template_values?: Array<PromotionTemplateValue>;
}
export namespace PromotionCreate {
}


