namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemValidationEvent

module CatalogsCreativeAssetsItemErrorResponse =

  //#region CatalogsCreativeAssetsItemErrorResponse

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion
  //#region enums
  type ItemResponseKindEnum = CreativeAssetsItemErrorEnum of string  
  //#endregion

  type CatalogsCreativeAssetsItemErrorResponse = {
    CatalogType : CatalogTypeEnum;
    CreativeAssetsId : string;
    Errors : ItemValidationEvent[];
    ItemResponseKind : ItemResponseKindEnum;
  }
  //#endregion
