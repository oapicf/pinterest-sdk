import { InviteDataResponse } from './invite-data-response';
import { BusinessAccessUserSummary } from './business-access-user-summary';


/**
 * An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.
 */
export interface InviteBusinessRoleBinding { 
  /**
   * Unique identifier for the business that created the invite/request.
   */
  created_by_business_id?: string;
  /**
   * Unique identifier for the user that created the invite/request.
   */
  created_by_user_id?: string;
  /**
   * Unique identifier of the invite/request.
   */
  id?: string;
  invite_data?: InviteDataResponse;
  /**
   * Indicates whether the invite/request was received.
   */
  is_received_invite?: boolean;
  /**
   * Metadata for the member/partner that was sent the invite/request.
   */
  user?: BusinessAccessUserSummary;
}

