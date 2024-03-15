namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AdGroupSummaryStatus =

  //#region AdGroupSummaryStatus

  let RUNNINGEnum = "RUNNING"
  let PAUSEDEnum = "PAUSED"
  let NOTSTARTEDEnum = "NOT_STARTED"
  let COMPLETEDEnum = "COMPLETED"
  let ADVERTISERDISABLEDEnum = "ADVERTISER_DISABLED"
  let ARCHIVEDEnum = "ARCHIVED"
  let DRAFTEnum = "DRAFT"
  let DELETEDDRAFTEnum = "DELETED_DRAFT"
  type AdGroupSummaryStatus = string

  //#endregion
