namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TokenGrantType

module OauthAccessToken =

  //#region OauthAccessToken


  type OauthAccessToken = {
    AccessToken : string;
    ExpiresIn : int;
    RefreshToken : string;
    RefreshTokenExpiresAt : int;
    RefreshTokenExpiresIn : int;
    ResponseType : TokenGrantType;
    Scope : string;
    TokenType : string;
  }
  //#endregion
