namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsAttributes
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.Pin

module CatalogsCreativeAssetsItemResponse =

  //#region CatalogsCreativeAssetsItemResponse


  type CatalogsCreativeAssetsItemResponse = {
    CatalogType : CatalogsType;
    CreativeAssetsId : string;
    Pins : Pin[];
    Attributes : CatalogsCreativeAssetsAttributes;
  }
  //#endregion
