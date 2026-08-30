namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CampaignPlanningResponseErrorCode

module CampaignPlanningResponseError =

  //#region CampaignPlanningResponseError


  type CampaignPlanningResponseError = {
    Code : CampaignPlanningResponseErrorCode;
    Message : string;
  }
  //#endregion
