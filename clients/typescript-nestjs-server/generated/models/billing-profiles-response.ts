import { BillingProfilePaymentMethodBrand } from './billing-profile-payment-method-brand';
import { BillingProfileStatus } from './billing-profile-status';
import { BillingProfileCardType } from './billing-profile-card-type';
import { BillingType } from './billing-type';


export interface BillingProfilesResponse { 
  /**
   * Advertiser ID of the billing.
   */
  advertiser_id?: string;
  /**
   * Billing type of the advertiser
   */
  billing_type?: BillingType;
  /**
   * Type of the card.
   */
  card_type?: BillingProfileCardType;
  /**
   * Billing ID.
   */
  id?: string;
  /**
   * Brand of the payment method.
   */
  payment_method_brand?: BillingProfilePaymentMethodBrand;
  /**
   * Status of the billing.
   */
  status?: BillingProfileStatus;
}
export namespace BillingProfilesResponse {
}


