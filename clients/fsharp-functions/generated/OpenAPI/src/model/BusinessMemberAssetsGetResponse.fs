namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssetIdPermissions
open OpenAPI.Model.TotalCountByEntityStatus
open OpenAPI.Model.string option

module BusinessMemberAssetsGetResponse =

  //#region BusinessMemberAssetsGetResponse

  [<CLIMutable>]
  type BusinessMemberAssetsGetResponse = {
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
    [<JsonProperty(PropertyName = "items")>]
    Items : AssetIdPermissions[];
    [<JsonProperty(PropertyName = "total_data_count")>]
    TotalDataCount : int;
    [<JsonProperty(PropertyName = "total_data_count_by_status")>]
    TotalDataCountByStatus : TotalCountByEntityStatus;
  }

  //#endregion
