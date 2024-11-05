namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PermissionsWithOwner =

  //#region PermissionsWithOwner

  let ADMINEnum = "ADMIN"
  let ANALYSTEnum = "ANALYST"
  let FINANCEMANAGEREnum = "FINANCE_MANAGER"
  let AUDIENCEMANAGEREnum = "AUDIENCE_MANAGER"
  let CAMPAIGNMANAGEREnum = "CAMPAIGN_MANAGER"
  let CATALOGSMANAGEREnum = "CATALOGS_MANAGER"
  let CATALOGSVIEWEREnum = "CATALOGS_VIEWER"
  let PROFILEPUBLISHEREnum = "PROFILE_PUBLISHER"
  let OWNEREnum = "OWNER"
  type PermissionsWithOwner = string

  //#endregion
