namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreateCreativeAssetsItem
open OpenAPI.Model.CatalogsDeleteCreativeAssetsItem
open OpenAPI.Model.CatalogsUpdatableCreativeAssetsAttributes
open OpenAPI.Model.CatalogsUpdateCreativeAssetsItem
open OpenAPI.Model.CatalogsUpsertCreativeAssetsItem

module CatalogsCreativeAssetsBatchItem =

  //#region CatalogsCreativeAssetsBatchItem

  //#region enums
  type OperationEnum = DELETEEnum of string  
  //#endregion

  type CatalogsCreativeAssetsBatchItem = {
    Attributes : CatalogsUpdatableCreativeAssetsAttributes;
    CreativeAssetsId : string;
    Operation : OperationEnum;
  }
  //#endregion
