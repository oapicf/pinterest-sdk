

/**
 * Request containing OTP and Amazon storefront info called by Amazon
 */
export interface AmazonConnectRequest { 
  /**
   * The Amazon storefront id
   */
  amazon_storefront_id?: string;
  /**
   * The Amazon storefront name
   */
  amazon_storefront_name: string;
  /**
   * The Amazon storefront url
   */
  amazon_storefront_url: string;
  /**
   * The Amazon user id
   */
  amazon_user_id?: string;
  /**
   * The Amazon account linking status
   */
  is_amazon_account_linked: boolean;
  /**
   * The one time passcode for Pinterest-initiated linking requests
   */
  one_time_passcode?: string;
  /**
   * The Pinterest user id for Amazon-initiated linking requests
   */
  pinterest_user_id?: string;
}

