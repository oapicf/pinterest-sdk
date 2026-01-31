namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsReportStats
open OpenAPI.Model.string option

module ReportsStats200Response =

  //#region ReportsStats200Response


  type reports_stats_200_response = {
    Bookmark : string option;
    Items : CatalogsReportStats[];
  }
  //#endregion
