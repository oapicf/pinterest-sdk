namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ItemIdStoreCodePair =

  //#region ItemIdStoreCodePair

  [<CLIMutable>]
  type ItemIdStoreCodePair = {
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "store_code")>]
    StoreCode : string;
  }

  //#endregion
