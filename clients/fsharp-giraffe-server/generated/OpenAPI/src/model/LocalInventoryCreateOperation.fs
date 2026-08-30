namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RetailLocalInventoryItemAttributes

module LocalInventoryCreateOperation =

  //#region LocalInventoryCreateOperation

  //#region enums
  type OperationEnum = CREATEEnum of string  
  //#endregion

  type LocalInventoryCreateOperation = {
    Attributes : RetailLocalInventoryItemAttributes;
    ItemId : string;
    Operation : OperationEnum;
    StoreCode : string;
  }
  //#endregion
