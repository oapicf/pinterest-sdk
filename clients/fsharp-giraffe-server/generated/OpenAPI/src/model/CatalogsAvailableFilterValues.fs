namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsAvailableFilterValues
open OpenAPI.Model.CatalogsCreativeAssetsFilterValuesMap
open OpenAPI.Model.CatalogsHotelAvailableFilterValues
open OpenAPI.Model.CatalogsRetailAvailableFilterValues

module CatalogsAvailableFilterValues =

  //#region CatalogsAvailableFilterValues

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion

  type CatalogsAvailableFilterValues = {
    CatalogType : CatalogTypeEnum;
    FilterValues : CatalogsCreativeAssetsFilterValuesMap;
  }
  //#endregion
