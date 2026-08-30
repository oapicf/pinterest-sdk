namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdGroupsCreate200ResponseItemsInner

module AdGroupsCreate200Response =

  //#region AdGroupsCreate200Response

  [<CLIMutable>]
  type AdGroupsCreate200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : AdGroupsCreate200ResponseItemsInner[];
  }

  //#endregion
