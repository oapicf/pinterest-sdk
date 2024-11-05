namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BaseInviteDataResponseInviteData
open OpenAPI.Model.BusinessAccessUserSummary

module BaseInviteDataResponse =

  //#region BaseInviteDataResponse


  type BaseInviteDataResponse = {
    Id : string;
    InviteData : BaseInviteDataResponseInviteData;
    IsReceivedInvite : bool;
    User : BusinessAccessUserSummary;
  }
  //#endregion
