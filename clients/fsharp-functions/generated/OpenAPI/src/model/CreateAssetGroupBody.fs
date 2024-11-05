namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssetGroupType

module CreateAssetGroupBody =

  //#region CreateAssetGroupBody

  [<CLIMutable>]
  type CreateAssetGroupBody = {
    [<JsonProperty(PropertyName = "asset_group_name")>]
    AssetGroupName : string;
    [<JsonProperty(PropertyName = "asset_group_description")>]
    AssetGroupDescription : string;
    [<JsonProperty(PropertyName = "asset_group_types")>]
    AssetGroupTypes : AssetGroupType[];
  }

  //#endregion
