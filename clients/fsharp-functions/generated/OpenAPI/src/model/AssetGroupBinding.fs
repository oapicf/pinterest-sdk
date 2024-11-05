namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BusinessAccessUserSummary
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module AssetGroupBinding =

  //#region AssetGroupBinding

  [<CLIMutable>]
  type AssetGroupBinding = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "asset_group_name")>]
    AssetGroupName : string option;
    [<JsonProperty(PropertyName = "asset_group_description")>]
    AssetGroupDescription : string option;
    [<JsonProperty(PropertyName = "asset_group_types")>]
    AssetGroupTypes : string[];
    [<JsonProperty(PropertyName = "ad_accounts_ids")>]
    AdAccountsIds : string[];
    [<JsonProperty(PropertyName = "profiles_ids")>]
    ProfilesIds : string[];
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : int option;
    [<JsonProperty(PropertyName = "updated_time")>]
    UpdatedTime : int option;
    [<JsonProperty(PropertyName = "owner")>]
    Owner : BusinessAccessUserSummary;
    [<JsonProperty(PropertyName = "created_by")>]
    CreatedBy : BusinessAccessUserSummary;
  }

  //#endregion
