namespace OpenAPI.Model

open System
open System.Collections.Generic

module OauthAccessTokenRequest =

  //#region OauthAccessTokenRequest

  //#region enums
  type GrantTypeEnum = AuthorizationCodeEnum of string  |  RefreshTokenEnum of string  
  //#endregion

  type OauthAccessTokenRequest = {
    GrantType : GrantTypeEnum;
  }
  //#endregion
