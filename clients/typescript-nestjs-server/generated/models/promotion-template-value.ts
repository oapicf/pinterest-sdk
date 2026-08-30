import { Currency } from './currency';


export interface PromotionTemplateValue { 
  /**
   * Numeric value.
   */
  amount?: number;
  currency_code?: Currency;
  /**
   * Custom text.
   */
  custom_text?: string;
  /**
   * Percent value.
   */
  percent?: number;
}
export namespace PromotionTemplateValue {
}


