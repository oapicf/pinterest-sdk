namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupMultipleMediaTypesCriteria

module MediaTypeFilter =

  //#region MediaTypeFilter

  [<CLIMutable>]
  type MediaTypeFilter = {
    [<JsonProperty(PropertyName = "MEDIA_TYPE")>]
    MEDIA_TYPE : CatalogsProductGroupMultipleMediaTypesCriteria;
  }

  //#endregion
