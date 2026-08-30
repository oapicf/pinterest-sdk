namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PinterestLibBatchItemException =

  //#region PinterestLibBatchItemException

  [<CLIMutable>]
  type PinterestLibBatchItemException = {
    [<JsonProperty(PropertyName = "code")>]
    Code : int;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion
