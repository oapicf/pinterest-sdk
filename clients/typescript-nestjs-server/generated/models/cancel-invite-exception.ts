

/**
 * An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
 */
export interface CancelInviteException { 
  invite_id?: string;
  message?: string;
}

