namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsAttributes

module CatalogsUpsertCreativeAssetsItem =

  //#region CatalogsUpsertCreativeAssetsItem

  //#region enums
  type OperationEnum = UPSERTEnum of string  
  //#endregion

  type CatalogsUpsertCreativeAssetsItem = {
    CreativeAssetsId : string;
    Operation : OperationEnum;
    Attributes : CatalogsCreativeAssetsAttributes;
  }
  //#endregion
