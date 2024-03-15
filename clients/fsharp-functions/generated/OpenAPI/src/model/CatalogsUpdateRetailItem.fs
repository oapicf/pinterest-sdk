namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.UpdatableItemAttributes
open OpenAPI.Model.UpdateMaskFieldType

module CatalogsUpdateRetailItem =

  //#region CatalogsUpdateRetailItem

  [<CLIMutable>]
  type CatalogsUpdateRetailItem = {
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
    [<JsonProperty(PropertyName = "attributes")>]
    Attributes : UpdatableItemAttributes;
    [<JsonProperty(PropertyName = "update_mask")>]
    UpdateMask : UpdateMaskFieldType[];
  }

  //#endregion
