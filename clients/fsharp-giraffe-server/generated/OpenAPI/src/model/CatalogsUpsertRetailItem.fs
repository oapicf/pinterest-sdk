namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemAttributes

module CatalogsUpsertRetailItem =

  //#region CatalogsUpsertRetailItem

  //#region enums
  type OperationEnum = CREATEEnum of string  |  UPDATEEnum of string  |  UPSERTEnum of string  |  DELETEEnum of string  
  //#endregion

  type CatalogsUpsertRetailItem = {
    ItemId : string;
    Operation : OperationEnum;
    Attributes : ItemAttributes;
  }
  //#endregion
