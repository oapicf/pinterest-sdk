namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsReportFeedIngestionFilter =

  //#region CatalogsReportFeedIngestionFilter

  //#region enums
  type ReportTypeEnum = FEEDINGESTIONISSUESEnum of string  
  //#endregion

  type CatalogsReportFeedIngestionFilter = {
    FeedId : string;
    ProcessingResultId : string;
    ReportType : ReportTypeEnum;
  }
  //#endregion
