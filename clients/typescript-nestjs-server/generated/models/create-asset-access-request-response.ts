import { AssetAccessRequestError } from './asset-access-request-error';


export interface CreateAssetAccessRequestResponse { 
  /**
   * A list of errors associated with the asset access requests. Will be returned if there is an error.
   */
  exceptions?: Array<AssetAccessRequestError>;
  /**
   * An object mapping each partner id to the asset access request id. Only one request id is returned per partner.
   */
  invites?: { [key: string]: string; };
}

