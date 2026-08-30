import { CancelInviteResult } from './cancel-invite-result';
import { CancelInviteException } from './cancel-invite-exception';


export interface CancelInviteResultItem { 
  exception?: CancelInviteException | null;
  invite?: CancelInviteResult | null;
}

