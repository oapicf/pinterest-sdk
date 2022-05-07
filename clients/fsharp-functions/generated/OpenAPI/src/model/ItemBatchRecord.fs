namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemAttributes

module ItemBatchRecord =

  //#region ItemBatchRecord

  [<CLIMutable>]
  type ItemBatchRecord = {
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "attributes")>]
    Attributes : ItemAttributes;
  }

  //#endregion
