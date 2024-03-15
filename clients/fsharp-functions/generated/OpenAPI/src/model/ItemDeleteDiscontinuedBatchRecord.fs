namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ItemDeleteDiscontinuedBatchRecord =

  //#region ItemDeleteDiscontinuedBatchRecord

  [<CLIMutable>]
  type ItemDeleteDiscontinuedBatchRecord = {
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
  }

  //#endregion
