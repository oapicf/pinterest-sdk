namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsReportFeedIngestionFilter =

  //#region CatalogsReportFeedIngestionFilter

  //#region enums
  type ReportTypeEnum = FEEDINGESTIONISSUESEnum of string  
  //#endregion

  type CatalogsReportFeedIngestionFilter = {
    ReportType : ReportTypeEnum;
    FeedId : string;
    ProcessingResultId : string;
  }
  //#endregion
