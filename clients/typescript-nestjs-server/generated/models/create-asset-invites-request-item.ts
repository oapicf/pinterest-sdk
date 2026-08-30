import { InviteType } from './invite-type';
import { Permissions } from './permissions';


/**
 * Object declaring an asset role update to an invite.
 */
export interface CreateAssetInvitesRequestItem { 
  /**
   * An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
   */
  asset_id_to_permissions: { [key: string]: Array<Permissions>; };
  /**
   * Unique identifier of an invite.
   */
  invite_id: string;
  invite_type: InviteType;
}
export namespace CreateAssetInvitesRequestItem {
}


