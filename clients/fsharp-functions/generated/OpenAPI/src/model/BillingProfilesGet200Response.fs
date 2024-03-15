namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BillingProfilesResponse
open OpenAPI.Model.string option

module BillingProfilesGet200Response =

  //#region BillingProfilesGet200Response

  [<CLIMutable>]
  type BillingProfilesGet200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : BillingProfilesResponse[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
