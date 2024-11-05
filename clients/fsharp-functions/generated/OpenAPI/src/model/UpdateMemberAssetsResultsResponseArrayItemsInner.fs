namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.UsersForIndividualAssetResponse

module UpdateMemberAssetsResultsResponseArrayItemsInner =

  //#region UpdateMemberAssetsResultsResponseArrayItemsInner

  [<CLIMutable>]
  type UpdateMemberAssetsResultsResponseArrayItemsInner = {
    [<JsonProperty(PropertyName = "response")>]
    Response : UsersForIndividualAssetResponse;
  }

  //#endregion
