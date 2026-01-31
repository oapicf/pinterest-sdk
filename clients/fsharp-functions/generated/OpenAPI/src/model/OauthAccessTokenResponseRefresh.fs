namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OauthAccessTokenResponseRefresh =

  //#region OauthAccessTokenResponseRefresh

  [<CLIMutable>]
  type OauthAccessTokenResponseRefresh = {
    [<JsonProperty(PropertyName = "access_token")>]
    AccessToken : string;
    [<JsonProperty(PropertyName = "expires_in")>]
    ExpiresIn : int;
    [<JsonProperty(PropertyName = "response_type")>]
    ResponseType : string;
    [<JsonProperty(PropertyName = "scope")>]
    Scope : string;
    [<JsonProperty(PropertyName = "token_type")>]
    TokenType : string;
    [<JsonProperty(PropertyName = "refresh_token")>]
    RefreshToken : string;
    [<JsonProperty(PropertyName = "refresh_token_expires_at")>]
    RefreshTokenExpiresAt : int;
    [<JsonProperty(PropertyName = "refresh_token_expires_in")>]
    RefreshTokenExpiresIn : int;
  }

  //#endregion
