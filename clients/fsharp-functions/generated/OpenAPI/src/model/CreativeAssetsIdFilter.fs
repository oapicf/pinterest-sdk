namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupMultipleStringCriteria

module CreativeAssetsIdFilter =

  //#region CreativeAssetsIdFilter

  [<CLIMutable>]
  type CreativeAssetsIdFilter = {
    [<JsonProperty(PropertyName = "CREATIVE_ASSETS_ID")>]
    CREATIVE_ASSETS_ID : CatalogsProductGroupMultipleStringCriteria;
  }

  //#endregion
