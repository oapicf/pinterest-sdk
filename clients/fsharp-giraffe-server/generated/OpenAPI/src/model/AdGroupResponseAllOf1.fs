namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ActionType

module AdGroupResponseAllOf1 =

  //#region AdGroupResponseAllOf1


  type AdGroupResponse_allOf_1 = {
    CampaignId : string;
    BillableEvent : ActionType;
    Id : string;
    Type : string;
    AdAccountId : string;
    CreatedTime : int;
    UpdatedTime : int;
  }
  //#endregion
