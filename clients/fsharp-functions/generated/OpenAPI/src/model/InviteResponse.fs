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
    [<JsonProperty(PropertyName = "assets_summary")>]
    AssetsSummary : InviteAssetsSummary;
    [<JsonProperty(PropertyName = "business_roles")>]
    BusinessRoles : string[];
    [<JsonProperty(PropertyName = "created_by_business")>]
    CreatedByBusiness : BusinessAccessUserSummary;
    [<JsonProperty(PropertyName = "created_by_user")>]
    CreatedByUser : BusinessAccessUserSummary;
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : int;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "invite_data")>]
    InviteData : BaseInviteDataResponseInviteData;
    [<JsonProperty(PropertyName = "is_received_invite")>]
    IsReceivedInvite : bool;
    [<JsonProperty(PropertyName = "user")>]
    User : BusinessAccessUserSummary;
  }

  //#endregion
