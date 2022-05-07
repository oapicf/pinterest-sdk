namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupMultipleStringListCriteria

module GoogleProductCategory6Filter =

  //#region GoogleProductCategory6Filter

  [<CLIMutable>]
  type GoogleProductCategory6Filter = {
    [<JsonProperty(PropertyName = "GOOGLE_PRODUCT_CATEGORY_6")>]
    GOOGLEPRODUCTCATEGORY6 : CatalogsProductGroupMultipleStringListCriteria;
  }

  //#endregion
