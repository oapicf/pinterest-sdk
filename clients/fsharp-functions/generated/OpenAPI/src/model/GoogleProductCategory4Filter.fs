namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupMultipleStringListCriteria

module GoogleProductCategory4Filter =

  //#region GoogleProductCategory4Filter

  [<CLIMutable>]
  type GoogleProductCategory4Filter = {
    [<JsonProperty(PropertyName = "GOOGLE_PRODUCT_CATEGORY_4")>]
    GOOGLEPRODUCTCATEGORY4 : CatalogsProductGroupMultipleStringListCriteria;
  }

  //#endregion
