namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ItemDeleteBatchRecord =

  //#region ItemDeleteBatchRecord

  [<CLIMutable>]
  type ItemDeleteBatchRecord = {
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
  }

  //#endregion
