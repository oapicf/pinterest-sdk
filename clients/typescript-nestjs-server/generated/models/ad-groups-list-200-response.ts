import { AdGroup } from './ad-group';


export interface AdGroupsList200Response { 
  bookmark?: string | null;
  items: Array<AdGroup>;
}

