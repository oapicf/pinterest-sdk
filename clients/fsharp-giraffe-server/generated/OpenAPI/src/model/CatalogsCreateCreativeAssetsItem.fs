namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsAttributes

module CatalogsCreateCreativeAssetsItem =

  //#region CatalogsCreateCreativeAssetsItem

  //#region enums
  type OperationEnum = CREATEEnum of string  
  //#endregion

  type CatalogsCreateCreativeAssetsItem = {
    CreativeAssetsId : string;
    Operation : OperationEnum;
    Attributes : CatalogsCreativeAssetsAttributes;
  }
  //#endregion
