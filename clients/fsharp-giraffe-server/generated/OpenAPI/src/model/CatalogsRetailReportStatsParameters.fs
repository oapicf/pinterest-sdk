namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelReportStatsParametersReport

module CatalogsRetailReportStatsParameters =

  //#region CatalogsRetailReportStatsParameters

  //#region enums
  type CatalogTypeEnum = RETAILEnum of string  
  //#endregion

  type CatalogsRetailReportStatsParameters = {
    CatalogType : CatalogTypeEnum;
    Report : CatalogsHotelReportStatsParametersReport;
  }
  //#endregion
