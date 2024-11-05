namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsDeleteCreativeAssetsItem =

  //#region CatalogsDeleteCreativeAssetsItem

  //#region enums
  type OperationEnum = DELETEEnum of string  
  //#endregion

  type CatalogsDeleteCreativeAssetsItem = {
    CreativeAssetsId : string;
    Operation : OperationEnum;
  }
  //#endregion
