namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BaseInviteDataResponseInviteData
open OpenAPI.Model.BusinessAccessUserSummary
open OpenAPI.Model.InviteAssetsSummary

module InviteResponse =

  //#region InviteResponse

  [<CLIMutable>]
  type InviteResponse = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "invite_data")>]
    InviteData : BaseInviteDataResponseInviteData;
    [<JsonProperty(PropertyName = "is_received_invite")>]
    IsReceivedInvite : bool;
    [<JsonProperty(PropertyName = "user")>]
    User : BusinessAccessUserSummary;
    [<JsonProperty(PropertyName = "assets_summary")>]
    AssetsSummary : InviteAssetsSummary;
    [<JsonProperty(PropertyName = "business_roles")>]
    BusinessRoles : string[];
    [<JsonProperty(PropertyName = "created_by_business")>]
    CreatedByBusiness : obj;
    [<JsonProperty(PropertyName = "created_by_user")>]
    CreatedByUser : obj;
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : int;
  }

  //#endregion
