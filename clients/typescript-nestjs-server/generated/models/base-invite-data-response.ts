import { InviteDataResponse } from './invite-data-response';
import { BusinessAccessUserSummary } from './business-access-user-summary';


/**
 * Common invite/request data returned by the business access endpoints.
 */
export interface BaseInviteDataResponse { 
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

