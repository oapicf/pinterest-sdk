namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupMultipleStringListCriteria

module GoogleProductCategory2Filter =

  //#region GoogleProductCategory2Filter

  [<CLIMutable>]
  type GoogleProductCategory2Filter = {
    [<JsonProperty(PropertyName = "GOOGLE_PRODUCT_CATEGORY_2")>]
    GOOGLEPRODUCTCATEGORY2 : CatalogsProductGroupMultipleStringListCriteria;
  }

  //#endregion
