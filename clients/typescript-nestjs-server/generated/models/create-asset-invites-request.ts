import { CreateAssetInvitesRequestItem } from './create-asset-invites-request-item';


/**
 * Request body for updating asset roles for existing invites.
 */
export interface CreateAssetInvitesRequest { 
  invites: Array<CreateAssetInvitesRequestItem>;
}

