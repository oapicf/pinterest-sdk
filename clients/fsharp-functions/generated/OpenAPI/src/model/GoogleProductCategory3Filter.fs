namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupMultipleStringListCriteria

module GoogleProductCategory3Filter =

  //#region GoogleProductCategory3Filter

  [<CLIMutable>]
  type GoogleProductCategory3Filter = {
    [<JsonProperty(PropertyName = "GOOGLE_PRODUCT_CATEGORY_3")>]
    GOOGLEPRODUCTCATEGORY3 : CatalogsProductGroupMultipleStringListCriteria;
  }

  //#endregion
