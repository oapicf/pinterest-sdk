namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsReportStats
open OpenAPI.Model.string option

module ReportsStats200Response =

  //#region ReportsStats200Response


  type reports_stats_200_response = {
    Items : CatalogsReportStats[];
    Bookmark : string option;
  }
  //#endregion
