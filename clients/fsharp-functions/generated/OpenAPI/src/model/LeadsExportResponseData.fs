namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LeadsExportStatus
open OpenAPI.Model.string option

module LeadsExportResponseData =

  //#region LeadsExportResponseData

  [<CLIMutable>]
  type LeadsExportResponseData = {
    [<JsonProperty(PropertyName = "export_status")>]
    ExportStatus : LeadsExportStatus;
    [<JsonProperty(PropertyName = "download_url")>]
    DownloadUrl : string option;
  }

  //#endregion
