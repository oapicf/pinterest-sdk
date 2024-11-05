namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreateRetailItem
open OpenAPI.Model.CatalogsDeleteRetailItem
open OpenAPI.Model.CatalogsUpdateRetailItem
open OpenAPI.Model.CatalogsUpsertRetailItem
open OpenAPI.Model.ItemAttributesRequest
open OpenAPI.Model.UpdateMaskFieldType

module CatalogsRetailBatchRequestItemsInner =

  //#region CatalogsRetailBatchRequestItemsInner

  //#region enums
  type OperationEnum = DELETEEnum of string  
  //#endregion

  type CatalogsRetailBatchRequest_items_inner = {
    ItemId : string;
    Operation : OperationEnum;
    Attributes : ItemAttributesRequest;
    UpdateMask : UpdateMaskFieldType[];
  }
  //#endregion
