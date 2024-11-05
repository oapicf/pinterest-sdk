namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsReportDistributionIssueFilter =

  //#region CatalogsReportDistributionIssueFilter

  //#region enums
  type ReportTypeEnum = DISTRIBUTIONISSUESEnum of string  
  //#endregion

  type CatalogsReportDistributionIssueFilter = {
    ReportType : ReportTypeEnum;
    CatalogId : string;
  }
  //#endregion
