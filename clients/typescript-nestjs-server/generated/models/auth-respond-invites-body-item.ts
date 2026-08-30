import { AuthRespondInviteAction } from './auth-respond-invite-action';


export interface AuthRespondInvitesBodyItem { 
  action: AuthRespondInviteAction;
  /**
   * Unique identifier of an invite.
   */
  invite_id: string;
}

