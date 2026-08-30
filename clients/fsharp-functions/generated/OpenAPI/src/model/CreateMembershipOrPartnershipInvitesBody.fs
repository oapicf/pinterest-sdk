namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BusinessRoleForInvite
open OpenAPI.Model.InviteType

module CreateMembershipOrPartnershipInvitesBody =

  //#region CreateMembershipOrPartnershipInvitesBody

  [<CLIMutable>]
  type CreateMembershipOrPartnershipInvitesBody = {
    [<JsonProperty(PropertyName = "business_role")>]
    BusinessRole : BusinessRoleForInvite;
    [<JsonProperty(PropertyName = "invite_type")>]
    InviteType : InviteType;
    [<JsonProperty(PropertyName = "members")>]
    Members : string[];
    [<JsonProperty(PropertyName = "partners")>]
    Partners : string[];
  }

  //#endregion
