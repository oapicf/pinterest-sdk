import { AuthRespondInvitesBodyItem } from './auth-respond-invites-body-item';


/**
 * An object with a list of all the invites the user would like to respond to and the action to take.
 */
export interface AuthRespondInvitesBody { 
  invites: Array<AuthRespondInvitesBodyItem>;
}

