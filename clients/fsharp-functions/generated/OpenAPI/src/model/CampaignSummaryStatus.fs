namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CampaignSummaryStatus =

  //#region CampaignSummaryStatus

  let RUNNINGEnum = "RUNNING"
  let PAUSEDEnum = "PAUSED"
  let NOTSTARTEDEnum = "NOT_STARTED"
  let COMPLETEDEnum = "COMPLETED"
  let ADVERTISERDISABLEDEnum = "ADVERTISER_DISABLED"
  let ARCHIVEDEnum = "ARCHIVED"
  let DRAFTEnum = "DRAFT"
  let DELETEDDRAFTEnum = "DELETED_DRAFT"
  type CampaignSummaryStatus = string

  //#endregion
