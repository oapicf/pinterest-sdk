namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsReportDistributionIssueFilter
open OpenAPI.Model.CatalogsReportFeedIngestionFilter

module CatalogsHotelReportStatsParametersReport =

  //#region CatalogsHotelReportStatsParametersReport

  //#region enums
  type ReportTypeEnum = FEEDINGESTIONISSUESEnum of string  |  DISTRIBUTIONISSUESEnum of string  
  //#endregion

  type CatalogsHotelReportStatsParameters_report = {
    ReportType : ReportTypeEnum;
    FeedId : string;
    ProcessingResultId : string;
    CatalogId : string;
  }
  //#endregion
