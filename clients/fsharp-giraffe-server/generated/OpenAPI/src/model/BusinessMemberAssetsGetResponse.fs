namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssetIdPermissions
open OpenAPI.Model.TotalCountByEntityStatus
open OpenAPI.Model.string option

module BusinessMemberAssetsGetResponse =

  //#region BusinessMemberAssetsGetResponse


  type BusinessMemberAssetsGetResponse = {
    Bookmark : string option;
    Items : AssetIdPermissions[];
    TotalDataCount : int;
    TotalDataCountByStatus : TotalCountByEntityStatus;
  }
  //#endregion
