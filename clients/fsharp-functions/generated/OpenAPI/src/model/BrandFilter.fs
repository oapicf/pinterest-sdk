namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupMultipleStringCriteria

module BrandFilter =

  //#region BrandFilter

  [<CLIMutable>]
  type BrandFilter = {
    [<JsonProperty(PropertyName = "BRAND")>]
    BRAND : CatalogsProductGroupMultipleStringCriteria;
  }

  //#endregion
