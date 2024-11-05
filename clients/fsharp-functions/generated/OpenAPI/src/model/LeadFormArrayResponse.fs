namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LeadFormArrayResponseItemsInner

module LeadFormArrayResponse =

  //#region LeadFormArrayResponse

  [<CLIMutable>]
  type LeadFormArrayResponse = {
    [<JsonProperty(PropertyName = "items")>]
    Items : LeadFormArrayResponseItemsInner[];
  }

  //#endregion
