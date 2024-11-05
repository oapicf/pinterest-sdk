namespace OpenAPI.Model

open System
open System.Collections.Generic

module OauthAccessTokenResponseClientCredentials =

  //#region OauthAccessTokenResponseClientCredentials

  //#region enums
  type ResponseTypeEnum = AuthorizationCodeEnum of string  |  RefreshTokenEnum of string  |  ClientCredentialsEnum of string  
  //#endregion

  type OauthAccessTokenResponseClientCredentials = {
    ResponseType : ResponseTypeEnum;
    AccessToken : string;
    TokenType : string;
    ExpiresIn : int;
    Scope : string;
  }
  //#endregion
