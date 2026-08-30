namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupProductCounts
open OpenAPI.Model.CatalogsHotelProductGroupProductCounts
open OpenAPI.Model.CatalogsRetailProductGroupProductCounts

module CatalogsProductGroupProductCountsVertical =

  //#region CatalogsProductGroupProductCountsVertical

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion

  type CatalogsProductGroupProductCountsVertical = {
    CatalogType : CatalogTypeEnum;
    InStock : decimal;
    OutOfStock : decimal;
    Preorder : decimal;
    Total : decimal;
    Videos : decimal;
    AppLinks : decimal;
    Images : decimal;
  }
  //#endregion
