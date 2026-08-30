namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Permissions
open System.Collections.Generic

module CreateAssetAccessRequestItem =

  //#region CreateAssetAccessRequestItem

  [<CLIMutable>]
  type CreateAssetAccessRequestItem = {
    [<JsonProperty(PropertyName = "asset_id_to_permissions")>]
    AssetIdToPermissions : IDictionary<string, list>;
    [<JsonProperty(PropertyName = "partner_id")>]
    PartnerId : string;
  }

  //#endregion
