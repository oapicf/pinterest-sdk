namespace OpenAPI.Model

open System
open System.Collections.Generic

module LocalInventoryDeleteOperation =

  //#region LocalInventoryDeleteOperation

  //#region enums
  type OperationEnum = DELETEEnum of string  
  //#endregion

  type LocalInventoryDeleteOperation = {
    ItemId : string;
    Operation : OperationEnum;
    StoreCode : string;
  }
  //#endregion
