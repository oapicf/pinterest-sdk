namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsDeleteRetailItem =

  //#region CatalogsDeleteRetailItem

  [<CLIMutable>]
  type CatalogsDeleteRetailItem = {
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "last_updated_time")>]
    LastUpdatedTime : int64;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
  }

  //#endregion
