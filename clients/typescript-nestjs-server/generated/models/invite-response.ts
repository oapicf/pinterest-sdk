import { InviteDataResponse } from './invite-data-response';
import { BusinessAccessUserSummary } from './business-access-user-summary';
import { InviteAssetsSummary } from './invite-assets-summary';


/**
 * A user\'s username or email OR a partner id that caused the error.
 */
export interface InviteResponse { 
  assets_summary?: InviteAssetsSummary | null;
  /**
   * The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
   */
  business_roles?: Array<string>;
  /**
   * Metadata for the business that created the invite/request.
   */
  created_by_business?: BusinessAccessUserSummary;
  /**
   * Metadata for the user that created the invite/request.
   */
  created_by_user?: BusinessAccessUserSummary;
  /**
   * The time the invite/request was created. Returned in milliseconds.
   */
  created_time?: number;
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

