namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemAttributesRequest

module CatalogsCreateRetailItem =

  //#region CatalogsCreateRetailItem

  //#region enums
  type OperationEnum = CREATEEnum of string  
  //#endregion

  type CatalogsCreateRetailItem = {
    ItemId : string;
    Operation : OperationEnum;
    Attributes : ItemAttributesRequest;
  }
  //#endregion
