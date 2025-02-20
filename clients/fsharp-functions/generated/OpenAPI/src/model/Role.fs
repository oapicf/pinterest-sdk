namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module Role =

  //#region Role

  let UNKNOWNEnum = "UNKNOWN"
  let OWNEREnum = "OWNER"
  let ADMINEnum = "ADMIN"
  let ANALYSTEnum = "ANALYST"
  let SOSREADEREnum = "SOS_READER"
  let FINANCEMANAGEREnum = "FINANCE_MANAGER"
  let AUDIENCEMANAGEREnum = "AUDIENCE_MANAGER"
  let CAMPAIGNMANAGEREnum = "CAMPAIGN_MANAGER"
  let CATALOGSMANAGEREnum = "CATALOGS_MANAGER"
  let RESTRICTEDOWNEREnum = "RESTRICTED_OWNER"
  let PROFILEMANAGEREnum = "PROFILE_MANAGER"
  let PROFILEPUBLISHEREnum = "PROFILE_PUBLISHER"
  let RESOURCEPINNERLISTOWNEREnum = "RESOURCE_PINNER_LIST_OWNER"
  let RESOURCEPINNERLISTREADEREnum = "RESOURCE_PINNER_LIST_READER"
  let BIZPINNERLISTSHAREREnum = "BIZ_PINNER_LIST_SHARER"
  let RESOURCECONVERSIONTAGSREADEREnum = "RESOURCE_CONVERSION_TAGS_READER"
  type Role = string

  //#endregion
