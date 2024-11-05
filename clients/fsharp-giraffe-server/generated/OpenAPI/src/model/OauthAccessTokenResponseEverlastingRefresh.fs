namespace OpenAPI.Model

open System
open System.Collections.Generic

module OauthAccessTokenResponseEverlastingRefresh =

  //#region OauthAccessTokenResponseEverlastingRefresh

  //#region enums
  type ResponseTypeEnum = AuthorizationCodeEnum of string  |  RefreshTokenEnum of string  |  ClientCredentialsEnum of string  
  //#endregion

  type OauthAccessTokenResponseEverlastingRefresh = {
    ResponseType : ResponseTypeEnum;
    AccessToken : string;
    TokenType : string;
    ExpiresIn : int;
    Scope : string;
    RefreshToken : string;
    RefreshTokenExpiresIn : int;
    RefreshTokenExpiresAt : int;
  }
  //#endregion
