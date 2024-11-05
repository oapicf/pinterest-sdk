namespace OpenAPI.Model

open System
open System.Collections.Generic

module OauthAccessTokenResponseRefresh =

  //#region OauthAccessTokenResponseRefresh

  //#region enums
  type ResponseTypeEnum = AuthorizationCodeEnum of string  |  RefreshTokenEnum of string  |  ClientCredentialsEnum of string  
  //#endregion

  type OauthAccessTokenResponseRefresh = {
    ResponseType : ResponseTypeEnum;
    AccessToken : string;
    TokenType : string;
    ExpiresIn : int;
    Scope : string;
  }
  //#endregion
