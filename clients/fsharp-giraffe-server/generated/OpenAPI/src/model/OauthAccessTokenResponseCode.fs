namespace OpenAPI.Model

open System
open System.Collections.Generic

module OauthAccessTokenResponseCode =

  //#region OauthAccessTokenResponseCode

  //#region enums
  type ResponseTypeEnum = AuthorizationCodeEnum of string  |  RefreshTokenEnum of string  |  ClientCredentialsEnum of string  
  //#endregion

  type OauthAccessTokenResponseCode = {
    RefreshToken : string;
    RefreshTokenExpiresAt : int;
    RefreshTokenExpiresIn : int;
    AccessToken : string;
    ExpiresIn : int;
    ResponseType : ResponseTypeEnum;
    Scope : string;
    TokenType : string;
  }
  //#endregion
