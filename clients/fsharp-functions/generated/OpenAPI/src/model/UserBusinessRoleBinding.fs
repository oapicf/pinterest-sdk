namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BusinessAccessUserSummary
open OpenAPI.Model.BusinessMemberAssetsSummary
open OpenAPI.Model.int option

module UserBusinessRoleBinding =

  //#region UserBusinessRoleBinding

  [<CLIMutable>]
  type UserBusinessRoleBinding = {
    [<JsonProperty(PropertyName = "assets_summary")>]
    AssetsSummary : BusinessMemberAssetsSummary;
    [<JsonProperty(PropertyName = "business_roles")>]
    BusinessRoles : string[];
    [<JsonProperty(PropertyName = "created_by_business")>]
    CreatedByBusiness : BusinessAccessUserSummary;
    [<JsonProperty(PropertyName = "created_by_user")>]
    CreatedByUser : BusinessAccessUserSummary;
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : int option;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "is_shared_partner")>]
    IsSharedPartner : bool;
    [<JsonProperty(PropertyName = "user")>]
    User : BusinessAccessUserSummary;
  }

  //#endregion
