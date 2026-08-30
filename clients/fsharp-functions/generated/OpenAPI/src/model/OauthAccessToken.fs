namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TokenGrantType

module OauthAccessToken =

  //#region OauthAccessToken

  [<CLIMutable>]
  type OauthAccessToken = {
    [<JsonProperty(PropertyName = "access_token")>]
    AccessToken : string;
    [<JsonProperty(PropertyName = "expires_in")>]
    ExpiresIn : int;
    [<JsonProperty(PropertyName = "refresh_token")>]
    RefreshToken : string;
    [<JsonProperty(PropertyName = "refresh_token_expires_at")>]
    RefreshTokenExpiresAt : int;
    [<JsonProperty(PropertyName = "refresh_token_expires_in")>]
    RefreshTokenExpiresIn : int;
    [<JsonProperty(PropertyName = "response_type")>]
    ResponseType : TokenGrantType;
    [<JsonProperty(PropertyName = "scope")>]
    Scope : string;
    [<JsonProperty(PropertyName = "token_type")>]
    TokenType : string;
  }

  //#endregion
