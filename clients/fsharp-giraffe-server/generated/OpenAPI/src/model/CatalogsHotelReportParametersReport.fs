namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsReportDistributionIssueFilter
open OpenAPI.Model.CatalogsReportFeedIngestionFilter

module CatalogsHotelReportParametersReport =

  //#region CatalogsHotelReportParametersReport

  //#region enums
  type ReportTypeEnum = DISTRIBUTIONISSUESEnum of string  
  //#endregion

  type CatalogsHotelReportParametersReport = {
    FeedId : string;
    ProcessingResultId : string;
    ReportType : ReportTypeEnum;
    CatalogId : string;
  }
  //#endregion
