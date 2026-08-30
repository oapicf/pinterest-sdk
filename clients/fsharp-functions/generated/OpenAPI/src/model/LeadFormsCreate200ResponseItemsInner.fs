namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LeadForm
open OpenAPI.Model.PinterestLibBatchItemException

module LeadFormsCreate200ResponseItemsInner =

  //#region LeadFormsCreate200ResponseItemsInner

  [<CLIMutable>]
  type LeadFormsCreate200ResponseItemsInner = {
    [<JsonProperty(PropertyName = "data")>]
    Data : LeadForm;
    [<JsonProperty(PropertyName = "exceptions")>]
    Exceptions : PinterestLibBatchItemException[];
  }

  //#endregion
