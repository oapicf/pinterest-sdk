namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdGroupResponse
open OpenAPI.Model.string option

module AdGroupsList200Response =

  //#region AdGroupsList200Response

  [<CLIMutable>]
  type AdGroupsList200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : AdGroupResponse[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
