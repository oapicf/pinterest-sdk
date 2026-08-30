import { AdAccountsAudience } from './ad-accounts-audience';


export interface AudiencesList200Response { 
  bookmark?: string | null;
  items: Array<AdAccountsAudience>;
}

