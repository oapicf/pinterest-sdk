namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.UpdatePartnerAssetsResult

module UpdatePartnerAssetsResultsResponseArray =

  //#region UpdatePartnerAssetsResultsResponseArray

  [<CLIMutable>]
  type UpdatePartnerAssetsResultsResponseArray = {
    [<JsonProperty(PropertyName = "items")>]
    Items : UpdatePartnerAssetsResult[];
  }

  //#endregion
