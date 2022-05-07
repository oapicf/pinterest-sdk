namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module AdsAnalyticsGetAsyncResponse =

  //#region AdsAnalyticsGetAsyncResponse


  type AdsAnalyticsGetAsyncResponse = {
    ReportStatus : string;
    Url : string option;
    Size : decimal option;
  }
  //#endregion
