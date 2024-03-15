namespace OpenAPI.Model

open System
open System.Collections.Generic

module OauthAccessTokenResponse =

  //#region OauthAccessTokenResponse

  //#region enums
  type ResponseTypeEnum = AuthorizationCodeEnum of string  |  RefreshTokenEnum of string  
  //#endregion

  type OauthAccessTokenResponse = {
    ResponseType : ResponseTypeEnum;
    AccessToken : string;
    TokenType : string;
    ExpiresIn : int;
    Scope : string;
  }
  //#endregion
