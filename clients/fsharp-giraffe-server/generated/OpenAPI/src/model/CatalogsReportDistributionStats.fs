namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsReportDistributionStats =

  //#region CatalogsReportDistributionStats

  //#region enums
  type ReportTypeEnum = DISTRIBUTIONISSUESEnum of string  
  //#endregion

  type CatalogsReportDistributionStats = {
    CatalogId : string;
    Code : int;
    CodeLabel : string;
    IneligibleForAds : bool;
    IneligibleForOrganic : bool;
    Message : string;
    Occurrences : int;
    ReportType : ReportTypeEnum;
  }
  //#endregion
