namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OauthAccessTokenResponseEverlastingRefresh =

  //#region OauthAccessTokenResponseEverlastingRefresh

  [<CLIMutable>]
  type OauthAccessTokenResponseEverlastingRefresh = {
    [<JsonProperty(PropertyName = "response_type")>]
    ResponseType : string;
    [<JsonProperty(PropertyName = "access_token")>]
    AccessToken : string;
    [<JsonProperty(PropertyName = "token_type")>]
    TokenType : string;
    [<JsonProperty(PropertyName = "expires_in")>]
    ExpiresIn : int;
    [<JsonProperty(PropertyName = "scope")>]
    Scope : string;
    [<JsonProperty(PropertyName = "refresh_token")>]
    RefreshToken : string;
    [<JsonProperty(PropertyName = "refresh_token_expires_in")>]
    RefreshTokenExpiresIn : int;
    [<JsonProperty(PropertyName = "refresh_token_expires_at")>]
    RefreshTokenExpiresAt : int;
  }

  //#endregion
