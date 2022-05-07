namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OauthAccessTokenRequestRefreshAllOf =

  //#region OauthAccessTokenRequestRefreshAllOf

  [<CLIMutable>]
  type OauthAccessTokenRequestRefreshAllOf = {
    [<JsonProperty(PropertyName = "refresh_token")>]
    RefreshToken : string;
    [<JsonProperty(PropertyName = "scope")>]
    Scope : string;
  }

  //#endregion
