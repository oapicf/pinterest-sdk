namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module LeadsExportStatus =

  //#region LeadsExportStatus

  let INPROGRESSEnum = "IN_PROGRESS"
  let FINISHEDEnum = "FINISHED"
  let FAILEDEnum = "FAILED"
  type LeadsExportStatus = string

  //#endregion
