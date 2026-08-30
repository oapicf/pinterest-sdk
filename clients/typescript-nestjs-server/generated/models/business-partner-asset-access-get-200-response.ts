import { BaseBusinessAssets } from './base-business-assets';


export interface BusinessPartnerAssetAccessGet200Response { 
  bookmark?: string | null;
  items: Array<BaseBusinessAssets>;
}

