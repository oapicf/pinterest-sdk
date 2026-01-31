namespace OpenAPI.Model

open System
open System.Collections.Generic

module OauthAccessTokenResponse =

  //#region OauthAccessTokenResponse

  //#region enums
  type ResponseTypeEnum = AuthorizationCodeEnum of string  |  RefreshTokenEnum of string  |  ClientCredentialsEnum of string  
  //#endregion

  type OauthAccessTokenResponse = {
    AccessToken : string;
    ExpiresIn : int;
    ResponseType : ResponseTypeEnum;
    Scope : string;
    TokenType : string;
  }
  //#endregion
