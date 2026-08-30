namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.UpdateMemberAssetResultItem

module UpdateMemberAssetsResultsResponseArray =

  //#region UpdateMemberAssetsResultsResponseArray

  [<CLIMutable>]
  type UpdateMemberAssetsResultsResponseArray = {
    [<JsonProperty(PropertyName = "items")>]
    Items : UpdateMemberAssetResultItem[];
  }

  //#endregion
