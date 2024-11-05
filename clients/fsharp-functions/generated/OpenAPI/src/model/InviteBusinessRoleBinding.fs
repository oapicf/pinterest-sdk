namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BaseInviteDataResponseInviteData
open OpenAPI.Model.BusinessAccessUserSummary

module InviteBusinessRoleBinding =

  //#region InviteBusinessRoleBinding

  [<CLIMutable>]
  type InviteBusinessRoleBinding = {
    [<JsonProperty(PropertyName = "created_by_business_id")>]
    CreatedByBusinessId : string;
    [<JsonProperty(PropertyName = "created_by_user_id")>]
    CreatedByUserId : string;
    [<JsonProperty(PropertyName = "user")>]
    User : BusinessAccessUserSummary;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "invite_data")>]
    InviteData : BaseInviteDataResponseInviteData;
    [<JsonProperty(PropertyName = "is_received_invite")>]
    IsReceivedInvite : bool;
  }

  //#endregion
