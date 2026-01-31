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
    [<JsonProperty(PropertyName = "ad_accounts_ids")>]
    AdAccountsIds : string[];
    [<JsonProperty(PropertyName = "asset_group_description")>]
    AssetGroupDescription : string option;
    [<JsonProperty(PropertyName = "asset_group_name")>]
    AssetGroupName : string option;
    [<JsonProperty(PropertyName = "asset_group_types")>]
    AssetGroupTypes : string[];
    [<JsonProperty(PropertyName = "catalogs_ids")>]
    CatalogsIds : string[];
    [<JsonProperty(PropertyName = "created_by")>]
    CreatedBy : BusinessAccessUserSummary;
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : int option;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "owner")>]
    Owner : BusinessAccessUserSummary;
    [<JsonProperty(PropertyName = "profiles_ids")>]
    ProfilesIds : string[];
    [<JsonProperty(PropertyName = "updated_time")>]
    UpdatedTime : int option;
  }

  //#endregion
