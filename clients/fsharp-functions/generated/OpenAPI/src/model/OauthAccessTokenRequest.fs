namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OauthAccessTokenRequest =

  //#region OauthAccessTokenRequest

  [<CLIMutable>]
  type OauthAccessTokenRequest = {
    [<JsonProperty(PropertyName = "grant_type")>]
    GrantType : string;
  }

  //#endregion
