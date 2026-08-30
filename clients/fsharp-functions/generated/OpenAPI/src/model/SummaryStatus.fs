namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module SummaryStatus =

  //#region SummaryStatus

  let RUNNINGEnum = "RUNNING"
  let PAUSEDEnum = "PAUSED"
  let NOTSTARTEDEnum = "NOT_STARTED"
  let COMPLETEDEnum = "COMPLETED"
  let ADVERTISERDISABLEDEnum = "ADVERTISER_DISABLED"
  let ARCHIVEDEnum = "ARCHIVED"
  let DRAFTEnum = "DRAFT"
  let DELETEDDRAFTEnum = "DELETED_DRAFT"
  type SummaryStatus = string

  //#endregion
