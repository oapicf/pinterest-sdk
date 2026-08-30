namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ProductCategoryEnum

module CatalogsProductGroupMultiplePinterestProductCategoryCriteria =

  //#region CatalogsProductGroupMultiplePinterestProductCategoryCriteria

  [<CLIMutable>]
  type CatalogsProductGroupMultiplePinterestProductCategoryCriteria = {
    [<JsonProperty(PropertyName = "negated")>]
    Negated : bool;
    [<JsonProperty(PropertyName = "values")>]
    Values : ProductCategoryEnum[];
  }

  //#endregion
