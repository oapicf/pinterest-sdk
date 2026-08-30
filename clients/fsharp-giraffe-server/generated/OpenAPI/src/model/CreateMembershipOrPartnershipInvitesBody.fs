namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BusinessRoleForInvite
open OpenAPI.Model.InviteType

module CreateMembershipOrPartnershipInvitesBody =

  //#region CreateMembershipOrPartnershipInvitesBody


  type CreateMembershipOrPartnershipInvitesBody = {
    BusinessRole : BusinessRoleForInvite;
    InviteType : InviteType;
    Members : string[];
    Partners : string[];
  }
  //#endregion
