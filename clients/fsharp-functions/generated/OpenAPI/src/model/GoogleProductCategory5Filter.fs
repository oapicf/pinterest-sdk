namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupMultipleStringListCriteria

module GoogleProductCategory5Filter =

  //#region GoogleProductCategory5Filter

  [<CLIMutable>]
  type GoogleProductCategory5Filter = {
    [<JsonProperty(PropertyName = "GOOGLE_PRODUCT_CATEGORY_5")>]
    GOOGLEPRODUCTCATEGORY5 : CatalogsProductGroupMultipleStringListCriteria;
  }

  //#endregion
