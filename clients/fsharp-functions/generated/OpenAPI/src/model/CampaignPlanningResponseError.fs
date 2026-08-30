namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CampaignPlanningResponseErrorCode

module CampaignPlanningResponseError =

  //#region CampaignPlanningResponseError

  [<CLIMutable>]
  type CampaignPlanningResponseError = {
    [<JsonProperty(PropertyName = "code")>]
    Code : CampaignPlanningResponseErrorCode;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion
