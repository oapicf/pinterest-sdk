namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsItemsPostFilters
open OpenAPI.Model.CatalogsItemsRequestLanguage
open OpenAPI.Model.Country

module CatalogsItemsRequest =

  //#region CatalogsItemsRequest


  type CatalogsItemsRequest = {
    Country : Country;
    Language : CatalogsItemsRequestLanguage;
    Filters : CatalogsItemsPostFilters;
  }
  //#endregion
