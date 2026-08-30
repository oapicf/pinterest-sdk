namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupMultiplePinterestProductCategoryCriteria

module PinterestProductCategoriesFilter =

  //#region PinterestProductCategoriesFilter

  [<CLIMutable>]
  type PinterestProductCategoriesFilter = {
    [<JsonProperty(PropertyName = "PINTEREST_PRODUCT_CATEGORIES")>]
    PINTEREST_PRODUCT_CATEGORIES : CatalogsProductGroupMultiplePinterestProductCategoryCriteria;
  }

  //#endregion
