import { UserSingleAssetBinding } from './user-single-asset-binding';


export interface BusinessAssetMembersGet200Response { 
  bookmark?: string | null;
  items: Array<UserSingleAssetBinding>;
}

