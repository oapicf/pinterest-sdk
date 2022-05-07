namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OauthAccessTokenRequest
open OpenAPI.Model.OauthAccessTokenRequestRefreshAllOf

module OauthAccessTokenRequestRefresh =

  //#region OauthAccessTokenRequestRefresh

  [<CLIMutable>]
  type OauthAccessTokenRequestRefresh = {
    [<JsonProperty(PropertyName = "refresh_token")>]
    RefreshToken : string;
    [<JsonProperty(PropertyName = "scope")>]
    Scope : string;
  }

  //#endregion
