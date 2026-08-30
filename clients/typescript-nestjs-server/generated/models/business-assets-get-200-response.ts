import { BusinessAssets } from './business-assets';


export interface BusinessAssetsGet200Response { 
  bookmark?: string | null;
  items: Array<BusinessAssets>;
}

