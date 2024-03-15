namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsDeleteRetailItem =

  //#region CatalogsDeleteRetailItem

  //#region enums
  type OperationEnum = CREATEEnum of string  |  UPDATEEnum of string  |  UPSERTEnum of string  |  DELETEEnum of string  
  //#endregion

  type CatalogsDeleteRetailItem = {
    ItemId : string;
    Operation : OperationEnum;
  }
  //#endregion
