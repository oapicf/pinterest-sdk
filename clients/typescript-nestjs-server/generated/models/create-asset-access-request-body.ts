import { CreateAssetAccessRequestItem } from './create-asset-access-request-item';


/**
 * An object containing a list of all the asset access requests
 */
export interface CreateAssetAccessRequestBody { 
  asset_requests: Array<CreateAssetAccessRequestItem>;
}

