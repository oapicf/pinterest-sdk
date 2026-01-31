namespace OpenAPI.Model

open System
open System.Collections.Generic

module OauthAccessTokenRequestRefresh =

  //#region OauthAccessTokenRequestRefresh

  //#region enums
  type GrantTypeEnum = AuthorizationCodeEnum of string  |  RefreshTokenEnum of string  |  ClientCredentialsEnum of string  
  //#endregion

  type OauthAccessTokenRequestRefresh = {
    RefreshToken : string;
    Scope : string;
    GrantType : GrantTypeEnum;
  }
  //#endregion
