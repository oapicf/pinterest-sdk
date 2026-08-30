import { AdsCreditDiscountType } from './ads-credit-discount-type';


export interface AdsCreditDiscountsResponse { 
  /**
   * True if the offer code is currently active.
   */
  active?: boolean;
  /**
   * Advertiser ID the offer was applied to.
   */
  advertiser_id?: string;
  /**
   * Currency value for the discount.
   */
  discountCurrency?: string | null;
  /**
   * The discount applied in the offer\'s currency value.
   */
  discountInMicroCurrency?: number | null;
  /**
   * The type of discount of this credit
   */
  discountType?: AdsCreditDiscountType | null;
  /**
   * The credits left to spend.
   */
  remainingDiscountInMicroCurrency?: number | null;
  /**
   * Human readable title of the offer code.
   */
  title?: string | null;
}
export namespace AdsCreditDiscountsResponse {
}


