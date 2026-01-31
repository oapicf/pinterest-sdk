namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OauthAccessTokenRequestClientCredentials =

  //#region OauthAccessTokenRequestClientCredentials

  [<CLIMutable>]
  type OauthAccessTokenRequestClientCredentials = {
    [<JsonProperty(PropertyName = "scope")>]
    Scope : string;
    [<JsonProperty(PropertyName = "grant_type")>]
    GrantType : string;
  }

  //#endregion
