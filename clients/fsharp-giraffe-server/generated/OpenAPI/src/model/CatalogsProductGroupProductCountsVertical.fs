namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupProductCounts
open OpenAPI.Model.CatalogsHotelProductGroupProductCounts
open OpenAPI.Model.CatalogsRetailProductGroupProductCounts
open OpenAPI.Model.CatalogsType

module CatalogsProductGroupProductCountsVertical =

  //#region CatalogsProductGroupProductCountsVertical


  type CatalogsProductGroupProductCountsVertical = {
    CatalogType : CatalogsType;
    InStock : decimal;
    OutOfStock : decimal;
    Preorder : decimal;
    Total : decimal;
    Videos : decimal;
  }
  //#endregion
