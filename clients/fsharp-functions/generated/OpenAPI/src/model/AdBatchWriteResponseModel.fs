namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdBatchItem

module AdBatchWriteResponseModel =

  //#region AdBatchWriteResponseModel

  [<CLIMutable>]
  type AdBatchWriteResponseModel = {
    [<JsonProperty(PropertyName = "items")>]
    Items : AdBatchItem[];
  }

  //#endregion
