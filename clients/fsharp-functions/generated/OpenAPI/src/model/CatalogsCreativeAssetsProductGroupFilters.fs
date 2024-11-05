namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupFilterKeys
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupFiltersAllOf
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupFiltersAnyOf

module CatalogsCreativeAssetsProductGroupFilters =

  //#region CatalogsCreativeAssetsProductGroupFilters

  [<CLIMutable>]
  type CatalogsCreativeAssetsProductGroupFilters = {
    [<JsonProperty(PropertyName = "any_of")>]
    AnyOf : CatalogsCreativeAssetsProductGroupFilterKeys[];
    [<JsonProperty(PropertyName = "all_of")>]
    AllOf : CatalogsCreativeAssetsProductGroupFilterKeys[];
  }

  //#endregion
