namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.IngestionSourceOptions
open OpenAPI.Model.LookbackPeriodOptions
open OpenAPI.Model.OverallStatusOptions
open OpenAPI.Model.QualityComponents
open OpenAPI.Model.SourcePlatformOptions

module EventQualityScore =

  //#region EventQualityScore

  [<CLIMutable>]
  type EventQualityScore = {
    [<JsonProperty(PropertyName = "ingestion_source")>]
    IngestionSource : IngestionSourceOptions;
    [<JsonProperty(PropertyName = "lookback_period")>]
    LookbackPeriod : LookbackPeriodOptions;
    [<JsonProperty(PropertyName = "overall_status")>]
    OverallStatus : OverallStatusOptions;
    [<JsonProperty(PropertyName = "quality_components")>]
    QualityComponents : QualityComponents;
    [<JsonProperty(PropertyName = "source_platform")>]
    SourcePlatform : SourcePlatformOptions;
  }

  //#endregion
