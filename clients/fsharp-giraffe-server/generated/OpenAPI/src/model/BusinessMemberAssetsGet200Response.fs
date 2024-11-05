namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssetIdPermissions
open OpenAPI.Model.string option

module BusinessMemberAssetsGet200Response =

  //#region BusinessMemberAssetsGet200Response


  type business_member_assets_get_200_response = {
    Items : AssetIdPermissions[];
    Bookmark : string option;
  }
  //#endregion
