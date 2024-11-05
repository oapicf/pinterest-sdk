namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupFilterKeys

module CatalogsCreativeAssetsProductGroupFiltersAllOf =

  //#region CatalogsCreativeAssetsProductGroupFiltersAllOf

  [<CLIMutable>]
  type CatalogsCreativeAssetsProductGroupFiltersAllOf = {
    [<JsonProperty(PropertyName = "all_of")>]
    AllOf : CatalogsCreativeAssetsProductGroupFilterKeys[];
  }

  //#endregion
