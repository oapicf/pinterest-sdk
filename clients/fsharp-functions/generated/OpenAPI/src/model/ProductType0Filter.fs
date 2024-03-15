namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupMultipleStringListCriteria

module ProductType0Filter =

  //#region ProductType0Filter

  [<CLIMutable>]
  type ProductType0Filter = {
    [<JsonProperty(PropertyName = "PRODUCT_TYPE_0")>]
    PRODUCTTYPE0 : CatalogsProductGroupMultipleStringListCriteria;
  }

  //#endregion
