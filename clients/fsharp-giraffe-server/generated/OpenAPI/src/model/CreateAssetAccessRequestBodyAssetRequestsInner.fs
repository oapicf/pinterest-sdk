namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Permissions
open System.Collections.Generic

module CreateAssetAccessRequestBodyAssetRequestsInner =

  //#region CreateAssetAccessRequestBodyAssetRequestsInner


  type CreateAssetAccessRequestBody_asset_requests_inner = {
    AssetIdToPermissions : IDictionary<string, Permissions[]>;
    PartnerId : string;
  }
  //#endregion
