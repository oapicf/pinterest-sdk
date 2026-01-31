namespace OpenAPI.Model

open System
open System.Collections.Generic

module OauthAccessTokenResponseRefresh =

  //#region OauthAccessTokenResponseRefresh

  //#region enums
  type ResponseTypeEnum = AuthorizationCodeEnum of string  |  RefreshTokenEnum of string  |  ClientCredentialsEnum of string  
  //#endregion

  type OauthAccessTokenResponseRefresh = {
    AccessToken : string;
    ExpiresIn : int;
    ResponseType : ResponseTypeEnum;
    Scope : string;
    TokenType : string;
    RefreshToken : string;
    RefreshTokenExpiresAt : int;
    RefreshTokenExpiresIn : int;
  }
  //#endregion
