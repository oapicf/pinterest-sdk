namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupMultipleStringListCriteria

module ProductType2Filter =

  //#region ProductType2Filter

  [<CLIMutable>]
  type ProductType2Filter = {
    [<JsonProperty(PropertyName = "PRODUCT_TYPE_2")>]
    PRODUCTTYPE2 : CatalogsProductGroupMultipleStringListCriteria;
  }

  //#endregion
