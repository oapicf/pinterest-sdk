namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupFilterOperatorTypeCriteria

module LinkFilter =

  //#region LinkFilter

  [<CLIMutable>]
  type LinkFilter = {
    [<JsonProperty(PropertyName = "LINK")>]
    LINK : CatalogsProductGroupFilterOperatorTypeCriteria;
  }

  //#endregion
