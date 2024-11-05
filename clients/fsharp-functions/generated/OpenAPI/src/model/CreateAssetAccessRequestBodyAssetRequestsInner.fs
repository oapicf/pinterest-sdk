namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Permissions
open System.Collections.Generic

module CreateAssetAccessRequestBodyAssetRequestsInner =

  //#region CreateAssetAccessRequestBodyAssetRequestsInner

  [<CLIMutable>]
  type CreateAssetAccessRequestBodyAssetRequestsInner = {
    [<JsonProperty(PropertyName = "partner_id")>]
    PartnerId : string;
    [<JsonProperty(PropertyName = "asset_id_to_permissions")>]
    AssetIdToPermissions : IDictionary<string, Permissions[]>;
  }

  //#endregion
