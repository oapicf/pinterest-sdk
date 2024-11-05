namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.InviteType

module CreateMembershipOrPartnershipInvitesBody =

  //#region CreateMembershipOrPartnershipInvitesBody

  //#region enums
  type BusinessRoleEnum = EMPLOYEEEnum of string  |  BIZADMINEnum of string  |  PARTNEREnum of string  
  //#endregion

  type CreateMembershipOrPartnershipInvitesBody = {
    BusinessRole : BusinessRoleEnum;
    InviteType : InviteType;
    Members : string[];
    Partners : string[];
  }
  //#endregion
