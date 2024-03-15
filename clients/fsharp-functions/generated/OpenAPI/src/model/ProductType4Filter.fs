namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupMultipleStringListCriteria

module ProductType4Filter =

  //#region ProductType4Filter

  [<CLIMutable>]
  type ProductType4Filter = {
    [<JsonProperty(PropertyName = "PRODUCT_TYPE_4")>]
    PRODUCTTYPE4 : CatalogsProductGroupMultipleStringListCriteria;
  }

  //#endregion
