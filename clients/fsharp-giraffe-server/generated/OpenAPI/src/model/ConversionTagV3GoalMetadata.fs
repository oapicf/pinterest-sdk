namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AttributionWindows
open OpenAPI.Model.ConversionEvent
open OpenAPI.Model.bool option

module ConversionTagV3GoalMetadata =

  //#region ConversionTagV3GoalMetadata


  type ConversionTagV3GoalMetadata = {
    AttributionWindows : AttributionWindows;
    ConversionEvent : ConversionEvent;
    ConversionTagId : string;
    CpaGoalValueInMicroCurrency : string;
    IsRoasOptimized : bool option;
    ReportingEvent : string;
  }
  //#endregion
