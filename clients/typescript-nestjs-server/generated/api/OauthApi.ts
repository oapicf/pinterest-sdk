import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { ConversionAccessToken, OauthAccessToken, TokenGrantType, TokenTypeHint,  } from '../models';


@Injectable()
export abstract class OauthApi {

  abstract oauthConversionToken( request: Request): ConversionAccessToken | Promise<ConversionAccessToken> | Observable<ConversionAccessToken>;


  abstract oauthToken(grantType: TokenGrantType, code: string | undefined, continuousRefresh: string | undefined, redirectUri: string | undefined, refreshToken: string | undefined, scope: string | undefined,  request: Request): OauthAccessToken | Promise<OauthAccessToken> | Observable<OauthAccessToken>;


  abstract tokenRevoke(token: string, tokenTypeHint: TokenTypeHint | undefined,  request: Request): void | Promise<void> | Observable<void>;

} 