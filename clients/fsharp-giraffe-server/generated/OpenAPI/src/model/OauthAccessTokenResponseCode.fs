namespace OpenAPI.Model

open System
open System.Collections.Generic

module OauthAccessTokenResponseCode =

  //#region OauthAccessTokenResponseCode

  //#region enums
  type ResponseTypeEnum = AuthorizationCodeEnum of string  |  RefreshTokenEnum of string  |  ClientCredentialsEnum of string  
  //#endregion

  type OauthAccessTokenResponseCode = {
    ResponseType : ResponseTypeEnum;
    AccessToken : string;
    TokenType : string;
    ExpiresIn : int;
    Scope : string;
    RefreshToken : string;
    RefreshTokenExpiresIn : int;
  }
  //#endregion
