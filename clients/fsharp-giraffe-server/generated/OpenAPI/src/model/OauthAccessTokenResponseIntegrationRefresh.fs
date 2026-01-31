namespace OpenAPI.Model

open System
open System.Collections.Generic

module OauthAccessTokenResponseIntegrationRefresh =

  //#region OauthAccessTokenResponseIntegrationRefresh

  //#region enums
  type ResponseTypeEnum = AuthorizationCodeEnum of string  |  RefreshTokenEnum of string  |  ClientCredentialsEnum of string  
  //#endregion

  type OauthAccessTokenResponseIntegrationRefresh = {
    RefreshToken : string;
    RefreshTokenExpiresIn : int;
    AccessToken : string;
    ExpiresIn : int;
    ResponseType : ResponseTypeEnum;
    Scope : string;
    TokenType : string;
  }
  //#endregion
