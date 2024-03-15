namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupMultipleStringListCriteria

module GoogleProductCategory0Filter =

  //#region GoogleProductCategory0Filter

  [<CLIMutable>]
  type GoogleProductCategory0Filter = {
    [<JsonProperty(PropertyName = "GOOGLE_PRODUCT_CATEGORY_0")>]
    GOOGLEPRODUCTCATEGORY0 : CatalogsProductGroupMultipleStringListCriteria;
  }

  //#endregion
