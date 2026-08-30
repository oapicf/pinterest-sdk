import { InviteExceptionResponse } from './invite-exception-response';
import { BaseInviteDataResponse } from './base-invite-data-response';


export interface RespondToInviteResultItem { 
  exception?: InviteExceptionResponse | null;
  /**
   * An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created.
   */
  invite?: BaseInviteDataResponse | null;
}

