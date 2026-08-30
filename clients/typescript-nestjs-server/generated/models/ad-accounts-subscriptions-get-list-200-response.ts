import { LeadSubscription } from './lead-subscription';


export interface AdAccountsSubscriptionsGetList200Response { 
  bookmark?: string | null;
  items: Array<LeadSubscription>;
}

