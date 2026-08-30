import { AdAccount } from './ad-account';


export interface AdAccountsList200Response { 
  bookmark?: string | null;
  items: Array<AdAccount>;
}

