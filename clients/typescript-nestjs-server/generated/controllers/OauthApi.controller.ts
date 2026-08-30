import { Body, Controller, DefaultValuePipe, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { OauthApi } from '../api';
import { ConversionAccessToken, OauthAccessToken, TokenGrantType, TokenTypeHint,  } from '../models';

@Controller()
export class OauthApiController {
  constructor(private readonly oauthApi: OauthApi) {}

  @Post('/oauth/conversion_token')
  oauthConversionToken(@Req() request: Request): ConversionAccessToken | Promise<ConversionAccessToken> | Observable<ConversionAccessToken> {
    return this.oauthApi.oauthConversionToken(request);
  }

  @Post('/oauth/token')
  oauthToken(grantType: TokenGrantType, code: string | undefined, continuousRefresh: string | undefined, redirectUri: string | undefined, refreshToken: string | undefined, scope: string | undefined, @Req() request: Request): OauthAccessToken | Promise<OauthAccessToken> | Observable<OauthAccessToken> {
    return this.oauthApi.oauthToken(grantType, code, continuousRefresh, redirectUri, refreshToken, scope, request);
  }

  @Post('/oauth/token/revoke')
  tokenRevoke(token: string, tokenTypeHint: TokenTypeHint | undefined, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.oauthApi.tokenRevoke(token, tokenTypeHint, request);
  }

} 