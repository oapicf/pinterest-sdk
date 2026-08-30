import { CancelInviteResultUser } from './cancel-invite-result-user';
import { InviteDataResponse } from './invite-data-response';


export interface CancelInviteResult { 
  id?: string;
  invite_data?: InviteDataResponse;
  is_received_invite?: boolean;
  user?: CancelInviteResultUser;
}

