import { BillingInvoice } from './billing-invoice';


export interface BillingInvoicesGet200Response { 
  bookmark?: string | null;
  items: Array<BillingInvoice>;
}

