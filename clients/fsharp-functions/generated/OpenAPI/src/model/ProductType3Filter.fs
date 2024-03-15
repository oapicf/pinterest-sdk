namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupMultipleStringListCriteria

module ProductType3Filter =

  //#region ProductType3Filter

  [<CLIMutable>]
  type ProductType3Filter = {
    [<JsonProperty(PropertyName = "PRODUCT_TYPE_3")>]
    PRODUCTTYPE3 : CatalogsProductGroupMultipleStringListCriteria;
  }

  //#endregion
