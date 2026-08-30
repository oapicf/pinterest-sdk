namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LeadFormsCreate200ResponseItemsInner

module LeadFormsCreate200Response =

  //#region LeadFormsCreate200Response

  [<CLIMutable>]
  type LeadFormsCreate200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : LeadFormsCreate200ResponseItemsInner[];
  }

  //#endregion
