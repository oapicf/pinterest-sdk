import { InviteBusinessRoleBinding } from './invite-business-role-binding';
import { InviteExceptionResponse } from './invite-exception-response';


/**
 * An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).
 */
export interface InviteActionResultItem { 
  exception?: InviteExceptionResponse | null;
  invite?: InviteBusinessRoleBinding | null;
}

