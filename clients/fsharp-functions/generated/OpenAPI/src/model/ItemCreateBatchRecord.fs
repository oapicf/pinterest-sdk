namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemAttributes

module ItemCreateBatchRecord =

  //#region ItemCreateBatchRecord

  [<CLIMutable>]
  type ItemCreateBatchRecord = {
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "attributes")>]
    Attributes : ItemAttributes;
  }

  //#endregion
