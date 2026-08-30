namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.UsersForIndividualAssetResponse

module UpdateMemberAssetResultItem =

  //#region UpdateMemberAssetResultItem

  [<CLIMutable>]
  type UpdateMemberAssetResultItem = {
    [<JsonProperty(PropertyName = "response")>]
    Response : UsersForIndividualAssetResponse;
  }

  //#endregion
