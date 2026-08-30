namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsAttributes
open OpenAPI.Model.Pin

module CatalogsCreativeAssetsItemResponse =

  //#region CatalogsCreativeAssetsItemResponse

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion
  //#region enums
  type ItemResponseKindEnum = CreativeAssetsItemEnum of string  
  //#endregion

  type CatalogsCreativeAssetsItemResponse = {
    Attributes : CatalogsCreativeAssetsAttributes;
    CatalogType : CatalogTypeEnum;
    CreativeAssetsId : string;
    ItemResponseKind : ItemResponseKindEnum;
    Pins : Pin[];
  }
  //#endregion
