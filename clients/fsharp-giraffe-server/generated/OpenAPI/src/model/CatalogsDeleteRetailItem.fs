namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsDeleteRetailItem =

  //#region CatalogsDeleteRetailItem

  //#region enums
  type OperationEnum = DELETEEnum of string  
  //#endregion

  type CatalogsDeleteRetailItem = {
    ItemId : string;
    Operation : OperationEnum;
  }
  //#endregion
