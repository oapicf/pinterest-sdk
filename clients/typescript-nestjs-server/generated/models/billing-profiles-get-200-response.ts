import { BillingProfilesResponse } from './billing-profiles-response';


export interface BillingProfilesGet200Response { 
  bookmark?: string | null;
  items: Array<BillingProfilesResponse>;
}

