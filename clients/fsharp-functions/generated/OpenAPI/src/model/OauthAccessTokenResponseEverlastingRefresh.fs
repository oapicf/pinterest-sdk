namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OauthAccessTokenResponse

module OauthAccessTokenResponseEverlastingRefresh =

  //#region OauthAccessTokenResponseEverlastingRefresh

  [<CLIMutable>]
  type OauthAccessTokenResponseEverlastingRefresh = {
    [<JsonProperty(PropertyName = "refresh_token")>]
    RefreshToken : string;
    [<JsonProperty(PropertyName = "refresh_token_expires_in")>]
    RefreshTokenExpiresIn : int;
    [<JsonProperty(PropertyName = "refresh_token_expires_at")>]
    RefreshTokenExpiresAt : int;
  }

  //#endregion
