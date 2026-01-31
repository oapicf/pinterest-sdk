namespace OpenAPI.Model

open System
open System.Collections.Generic

module OauthAccessTokenResponseEverlastingRefresh =

  //#region OauthAccessTokenResponseEverlastingRefresh

  //#region enums
  type ResponseTypeEnum = AuthorizationCodeEnum of string  |  RefreshTokenEnum of string  |  ClientCredentialsEnum of string  
  //#endregion

  type OauthAccessTokenResponseEverlastingRefresh = {
    RefreshToken : string;
    RefreshTokenExpiresIn : int;
    RefreshTokenExpiresAt : int;
    ResponseType : ResponseTypeEnum;
    AccessToken : string;
    TokenType : string;
    ExpiresIn : int;
    Scope : string;
  }
  //#endregion
