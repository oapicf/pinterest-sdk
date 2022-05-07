namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupMultipleStringListCriteria

module ProductType1Filter =

  //#region ProductType1Filter

  [<CLIMutable>]
  type ProductType1Filter = {
    [<JsonProperty(PropertyName = "PRODUCT_TYPE_1")>]
    PRODUCTTYPE1 : CatalogsProductGroupMultipleStringListCriteria;
  }

  //#endregion
