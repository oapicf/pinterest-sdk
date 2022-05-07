namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupMultipleStringListCriteria

module GoogleProductCategory1Filter =

  //#region GoogleProductCategory1Filter

  [<CLIMutable>]
  type GoogleProductCategory1Filter = {
    [<JsonProperty(PropertyName = "GOOGLE_PRODUCT_CATEGORY_1")>]
    GOOGLEPRODUCTCATEGORY1 : CatalogsProductGroupMultipleStringListCriteria;
  }

  //#endregion
