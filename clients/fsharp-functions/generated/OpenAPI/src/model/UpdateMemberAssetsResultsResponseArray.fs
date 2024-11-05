namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.UpdateMemberAssetsResultsResponseArrayItemsInner

module UpdateMemberAssetsResultsResponseArray =

  //#region UpdateMemberAssetsResultsResponseArray

  [<CLIMutable>]
  type UpdateMemberAssetsResultsResponseArray = {
    [<JsonProperty(PropertyName = "items")>]
    Items : UpdateMemberAssetsResultsResponseArrayItemsInner[];
  }

  //#endregion
