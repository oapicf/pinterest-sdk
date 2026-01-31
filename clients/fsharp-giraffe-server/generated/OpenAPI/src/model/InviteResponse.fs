namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BaseInviteDataResponseInviteData
open OpenAPI.Model.BusinessAccessUserSummary
open OpenAPI.Model.InviteAssetsSummary

module InviteResponse =

  //#region InviteResponse


  type InviteResponse = {
    Id : string;
    InviteData : BaseInviteDataResponseInviteData;
    IsReceivedInvite : bool;
    User : BusinessAccessUserSummary;
    AssetsSummary : InviteAssetsSummary;
    BusinessRoles : string[];
    CreatedByBusiness : obj;
    CreatedByUser : obj;
    CreatedTime : int;
  }
  //#endregion
