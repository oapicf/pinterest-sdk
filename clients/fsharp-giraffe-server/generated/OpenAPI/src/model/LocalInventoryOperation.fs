namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LocalInventoryCreateOperation
open OpenAPI.Model.LocalInventoryDeleteOperation
open OpenAPI.Model.LocalInventoryUpdateOperation
open OpenAPI.Model.LocalInventoryUpsertOperation
open OpenAPI.Model.RetailLocalInventoryItemAttributes

module LocalInventoryOperation =

  //#region LocalInventoryOperation

  //#region enums
  type OperationEnum = DELETEEnum of string  
  //#endregion

  type LocalInventoryOperation = {
    Attributes : RetailLocalInventoryItemAttributes;
    ItemId : string;
    Operation : OperationEnum;
    StoreCode : string;
  }
  //#endregion
