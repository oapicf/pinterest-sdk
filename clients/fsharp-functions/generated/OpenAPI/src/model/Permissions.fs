namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module Permissions =

  //#region Permissions

  let ADMINEnum = "ADMIN"
  let ANALYSTEnum = "ANALYST"
  let FINANCEMANAGEREnum = "FINANCE_MANAGER"
  let AUDIENCEMANAGEREnum = "AUDIENCE_MANAGER"
  let CAMPAIGNMANAGEREnum = "CAMPAIGN_MANAGER"
  let CATALOGSMANAGEREnum = "CATALOGS_MANAGER"
  let PROFILEPUBLISHEREnum = "PROFILE_PUBLISHER"
  type Permissions = string

  //#endregion
