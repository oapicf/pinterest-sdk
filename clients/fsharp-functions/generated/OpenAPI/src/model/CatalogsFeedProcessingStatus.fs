namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsFeedProcessingStatus =

  //#region CatalogsFeedProcessingStatus

  let COMPLETEDEnum = "COMPLETED"
  let COMPLETEDEARLYEnum = "COMPLETED_EARLY"
  let DISAPPROVEDEnum = "DISAPPROVED"
  let FAILEDEnum = "FAILED"
  let PROCESSINGEnum = "PROCESSING"
  let QUEUEDFORPROCESSINGEnum = "QUEUED_FOR_PROCESSING"
  let UNDERAPPEALEnum = "UNDER_APPEAL"
  let UNDERREVIEWEnum = "UNDER_REVIEW"
  type CatalogsFeedProcessingStatus = string

  //#endregion
