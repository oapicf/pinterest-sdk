namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CampaignPlanningResponseErrorCode =

  //#region CampaignPlanningResponseErrorCode

  let SERVERERROREnum = "SERVER_ERROR"
  let AUDIENCELISTMISSINGEnum = "AUDIENCE_LIST_MISSING"
  let INVALIDREQUESTEnum = "INVALID_REQUEST"
  let PRODUCTGROUPMISSINGEnum = "PRODUCT_GROUP_MISSING"
  type CampaignPlanningResponseErrorCode = string

  //#endregion
