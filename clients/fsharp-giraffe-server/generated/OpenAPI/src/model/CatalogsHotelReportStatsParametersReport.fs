namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsReportDistributionIssueFilter
open OpenAPI.Model.CatalogsReportFeedIngestionFilter

module CatalogsHotelReportStatsParametersReport =

  //#region CatalogsHotelReportStatsParametersReport

  //#region enums
  type ReportTypeEnum = DISTRIBUTIONISSUESEnum of string  
  //#endregion

  type CatalogsHotelReportStatsParametersReport = {
    FeedId : string;
    ProcessingResultId : string;
    ReportType : ReportTypeEnum;
    CatalogId : string;
  }
  //#endregion
