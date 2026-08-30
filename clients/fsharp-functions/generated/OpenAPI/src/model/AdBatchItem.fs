namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Ad
open OpenAPI.Model.PinterestLibError

module AdBatchItem =

  //#region AdBatchItem

  [<CLIMutable>]
  type AdBatchItem = {
    [<JsonProperty(PropertyName = "data")>]
    Data : Ad;
    [<JsonProperty(PropertyName = "exceptions")>]
    Exceptions : PinterestLibError;
  }

  //#endregion
