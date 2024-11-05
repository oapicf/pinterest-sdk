namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.UserSingleAssetBinding
open OpenAPI.Model.string option

module BusinessAssetMembersGet200Response =

  //#region BusinessAssetMembersGet200Response


  type business_asset_members_get_200_response = {
    Items : UserSingleAssetBinding[];
    Bookmark : string option;
  }
  //#endregion
