namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelReportStatsParameters
open OpenAPI.Model.CatalogsHotelReportStatsParametersReport
open OpenAPI.Model.CatalogsRetailReportStatsParameters
open OpenAPI.Model.CatalogsType

module ReportsStatsParametersParameter =

  //#region ReportsStatsParametersParameter


  type reports_stats_parameters_parameter = {
    CatalogType : CatalogsType;
    Report : CatalogsHotelReportStatsParametersReport;
  }
  //#endregion
