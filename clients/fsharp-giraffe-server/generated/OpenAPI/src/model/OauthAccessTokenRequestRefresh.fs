namespace OpenAPI.Model

open System
open System.Collections.Generic

module OauthAccessTokenRequestRefresh =

  //#region OauthAccessTokenRequestRefresh

  //#region enums
  type GrantTypeEnum = AuthorizationCodeEnum of string  |  RefreshTokenEnum of string  |  ClientCredentialsEnum of string  
  //#endregion

  type OauthAccessTokenRequestRefresh = {
    GrantType : GrantTypeEnum;
    RefreshToken : string;
    Scope : string;
    RefreshOn : bool;
  }
  //#endregion
