namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.DeletePartnerAssetsResult

module DeletePartnerAssetsResultsResponseArray =

  //#region DeletePartnerAssetsResultsResponseArray

  [<CLIMutable>]
  type DeletePartnerAssetsResultsResponseArray = {
    [<JsonProperty(PropertyName = "items")>]
    Items : DeletePartnerAssetsResult[];
  }

  //#endregion
