namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsUpdatableCreativeAssetsAttributes

module CatalogsUpdateCreativeAssetsItem =

  //#region CatalogsUpdateCreativeAssetsItem

  //#region enums
  type OperationEnum = UPDATEEnum of string  
  //#endregion

  type CatalogsUpdateCreativeAssetsItem = {
    CreativeAssetsId : string;
    Operation : OperationEnum;
    Attributes : CatalogsUpdatableCreativeAssetsAttributes;
  }
  //#endregion
