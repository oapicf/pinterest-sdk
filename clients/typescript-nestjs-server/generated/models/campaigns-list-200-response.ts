import { Campaign } from './campaign';


export interface CampaignsList200Response { 
  bookmark?: string | null;
  items: Array<Campaign>;
}

