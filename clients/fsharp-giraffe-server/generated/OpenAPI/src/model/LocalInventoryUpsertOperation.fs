namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RetailLocalInventoryItemAttributes

module LocalInventoryUpsertOperation =

  //#region LocalInventoryUpsertOperation

  //#region enums
  type OperationEnum = UPSERTEnum of string  
  //#endregion

  type LocalInventoryUpsertOperation = {
    Attributes : RetailLocalInventoryItemAttributes;
    ItemId : string;
    Operation : OperationEnum;
    StoreCode : string;
  }
  //#endregion
