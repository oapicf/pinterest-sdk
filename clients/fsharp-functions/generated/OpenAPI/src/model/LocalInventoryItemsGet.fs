namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LocalInventoryItemResponse

module LocalInventoryItemsGet =

  //#region LocalInventoryItemsGet

  [<CLIMutable>]
  type LocalInventoryItemsGet = {
    [<JsonProperty(PropertyName = "items")>]
    Items : LocalInventoryItemResponse[];
  }

  //#endregion
