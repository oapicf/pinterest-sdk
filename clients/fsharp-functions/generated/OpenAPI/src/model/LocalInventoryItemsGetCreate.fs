namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemIdStoreCodePair

module LocalInventoryItemsGetCreate =

  //#region LocalInventoryItemsGetCreate

  [<CLIMutable>]
  type LocalInventoryItemsGetCreate = {
    [<JsonProperty(PropertyName = "item_filters")>]
    ItemFilters : ItemIdStoreCodePair[];
  }

  //#endregion
