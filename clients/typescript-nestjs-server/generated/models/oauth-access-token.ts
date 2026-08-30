import { TokenGrantType } from './token-grant-type';


/**
 * Describes the valid schema for possible OAuth access token requests.
 */
export interface OauthAccessToken { 
  readonly access_token: string;
  readonly expires_in: number;
  refresh_token?: string;
  readonly refresh_token_expires_at?: number;
  readonly refresh_token_expires_in?: number;
  readonly response_type?: TokenGrantType;
  scope?: string;
  readonly token_type: string;
}
export namespace OauthAccessToken {
}


