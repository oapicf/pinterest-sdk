import { CartingRetailer } from './carting-retailer';


export interface CartingProduct { 
  /**
   * the internal Pinterest carting product id (different from industry product id)
   */
  carting_product_id: string;
  /**
   * Whether to display only the preferred retailers for the carting product
   */
  display_preferred_retailers_only?: boolean;
  /**
   * Whether to display the price for the carting product
   */
  display_product_price?: boolean;
  /**
   * A sorted array of preferred retailers for the carting product
   */
  preferred_retailers?: Array<CartingRetailer>;
  /**
   * Whether to randomize preferred retailers for the carting product
   */
  randomize_preferred_retailers?: boolean;
}

