namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsCreateRetailItem
open OpenAPI.Model.CatalogsDeleteRetailItem
open OpenAPI.Model.CatalogsUpdateRetailItem
open OpenAPI.Model.CatalogsUpsertRetailItem
open OpenAPI.Model.ItemAttributesRequest
open OpenAPI.Model.UpdateMaskFieldType

module CatalogsRetailBatchRequestItemsInner =

  //#region CatalogsRetailBatchRequestItemsInner

  [<CLIMutable>]
  type CatalogsRetailBatchRequestItemsInner = {
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
    [<JsonProperty(PropertyName = "attributes")>]
    Attributes : ItemAttributesRequest;
    [<JsonProperty(PropertyName = "update_mask")>]
    UpdateMask : UpdateMaskFieldType[];
  }

  //#endregion
