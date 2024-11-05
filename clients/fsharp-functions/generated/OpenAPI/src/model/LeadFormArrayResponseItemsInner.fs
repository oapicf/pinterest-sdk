namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Exception
open OpenAPI.Model.LeadFormResponse

module LeadFormArrayResponseItemsInner =

  //#region LeadFormArrayResponseItemsInner

  [<CLIMutable>]
  type LeadFormArrayResponseItemsInner = {
    [<JsonProperty(PropertyName = "data")>]
    Data : LeadFormResponse;
    [<JsonProperty(PropertyName = "exceptions")>]
    Exceptions : Exception[];
  }

  //#endregion
