namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OauthAccessTokenRequest

module OauthAccessTokenRequestRefresh =

  //#region OauthAccessTokenRequestRefresh

  [<CLIMutable>]
  type OauthAccessTokenRequestRefresh = {
    [<JsonProperty(PropertyName = "refresh_token")>]
    RefreshToken : string;
    [<JsonProperty(PropertyName = "scope")>]
    Scope : string;
    [<JsonProperty(PropertyName = "refresh_on")>]
    RefreshOn : bool;
  }

  //#endregion
