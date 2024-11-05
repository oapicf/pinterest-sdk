namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupMultipleStringCriteria

module ProductGroupReferenceFilter =

  //#region ProductGroupReferenceFilter

  [<CLIMutable>]
  type ProductGroupReferenceFilter = {
    [<JsonProperty(PropertyName = "PRODUCT_GROUP")>]
    PRODUCT_GROUP : CatalogsProductGroupMultipleStringCriteria;
  }

  //#endregion
