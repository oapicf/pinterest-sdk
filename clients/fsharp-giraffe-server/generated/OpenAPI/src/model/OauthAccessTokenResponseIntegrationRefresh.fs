namespace OpenAPI.Model

open System
open System.Collections.Generic

module OauthAccessTokenResponseIntegrationRefresh =

  //#region OauthAccessTokenResponseIntegrationRefresh

  //#region enums
  type ResponseTypeEnum = AuthorizationCodeEnum of string  |  RefreshTokenEnum of string  |  ClientCredentialsEnum of string  
  //#endregion

  type OauthAccessTokenResponseIntegrationRefresh = {
    ResponseType : ResponseTypeEnum;
    AccessToken : string;
    TokenType : string;
    ExpiresIn : int;
    Scope : string;
    RefreshToken : string;
    RefreshTokenExpiresIn : int;
  }
  //#endregion
