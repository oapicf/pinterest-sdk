namespace OpenAPI.Model

open System
open System.Collections.Generic

module OauthAccessTokenRequestClientCredentials =

  //#region OauthAccessTokenRequestClientCredentials

  //#region enums
  type GrantTypeEnum = AuthorizationCodeEnum of string  |  RefreshTokenEnum of string  |  ClientCredentialsEnum of string  
  //#endregion

  type OauthAccessTokenRequestClientCredentials = {
    GrantType : GrantTypeEnum;
    Scope : string;
  }
  //#endregion
