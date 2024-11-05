namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemAttributesRequest

module CatalogsUpsertRetailItem =

  //#region CatalogsUpsertRetailItem

  //#region enums
  type OperationEnum = UPSERTEnum of string  
  //#endregion

  type CatalogsUpsertRetailItem = {
    ItemId : string;
    Operation : OperationEnum;
    Attributes : ItemAttributesRequest;
  }
  //#endregion
