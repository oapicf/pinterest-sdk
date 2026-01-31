namespace OpenAPI.Model

open System
open System.Collections.Generic

module OauthAccessTokenRequestCode =

  //#region OauthAccessTokenRequestCode

  //#region enums
  type GrantTypeEnum = AuthorizationCodeEnum of string  |  RefreshTokenEnum of string  |  ClientCredentialsEnum of string  
  //#endregion

  type OauthAccessTokenRequestCode = {
    Code : string;
    RedirectUri : string;
    GrantType : GrantTypeEnum;
  }
  //#endregion
