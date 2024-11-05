namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LeadsExportStatus
open OpenAPI.Model.string option

module LeadsExportResponseData =

  //#region LeadsExportResponseData


  type LeadsExportResponseData = {
    ExportStatus : LeadsExportStatus;
    DownloadUrl : string option;
  }
  //#endregion
