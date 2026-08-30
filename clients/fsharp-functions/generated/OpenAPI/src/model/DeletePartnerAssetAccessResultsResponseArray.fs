namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.DeletePartnerAssetAccessResult

module DeletePartnerAssetAccessResultsResponseArray =

  //#region DeletePartnerAssetAccessResultsResponseArray

  [<CLIMutable>]
  type DeletePartnerAssetAccessResultsResponseArray = {
    [<JsonProperty(PropertyName = "items")>]
    Items : DeletePartnerAssetAccessResult[];
  }

  //#endregion
