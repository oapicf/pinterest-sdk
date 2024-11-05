namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OauthAccessTokenRequestClientCredentials =

  //#region OauthAccessTokenRequestClientCredentials

  [<CLIMutable>]
  type OauthAccessTokenRequestClientCredentials = {
    [<JsonProperty(PropertyName = "grant_type")>]
    GrantType : string;
    [<JsonProperty(PropertyName = "scope")>]
    Scope : string;
  }

  //#endregion
