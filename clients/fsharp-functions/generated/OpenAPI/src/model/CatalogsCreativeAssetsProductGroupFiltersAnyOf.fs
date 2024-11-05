namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupFilterKeys

module CatalogsCreativeAssetsProductGroupFiltersAnyOf =

  //#region CatalogsCreativeAssetsProductGroupFiltersAnyOf

  [<CLIMutable>]
  type CatalogsCreativeAssetsProductGroupFiltersAnyOf = {
    [<JsonProperty(PropertyName = "any_of")>]
    AnyOf : CatalogsCreativeAssetsProductGroupFilterKeys[];
  }

  //#endregion
