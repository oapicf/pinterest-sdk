namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdGroupArrayResponseElement

module AdGroupArrayResponse =

  //#region AdGroupArrayResponse

  [<CLIMutable>]
  type AdGroupArrayResponse = {
    [<JsonProperty(PropertyName = "items")>]
    Items : AdGroupArrayResponseElement[];
  }

  //#endregion
