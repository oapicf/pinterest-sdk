namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RetailLocalInventoryItemAttributesOptional

module LocalInventoryUpdateOperation =

  //#region LocalInventoryUpdateOperation

  //#region enums
  type OperationEnum = UPDATEEnum of string  
  //#endregion

  type LocalInventoryUpdateOperation = {
    Attributes : RetailLocalInventoryItemAttributesOptional;
    ItemId : string;
    Operation : OperationEnum;
    StoreCode : string;
  }
  //#endregion
