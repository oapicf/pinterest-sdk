namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.IngestionSourceOptions
open OpenAPI.Model.LookbackPeriodOptions
open OpenAPI.Model.OverallStatusOptions
open OpenAPI.Model.QualityComponents
open OpenAPI.Model.SourcePlatformOptions

module EventQualityScore =

  //#region EventQualityScore


  type EventQualityScore = {
    IngestionSource : IngestionSourceOptions;
    LookbackPeriod : LookbackPeriodOptions;
    OverallStatus : OverallStatusOptions;
    QualityComponents : QualityComponents;
    SourcePlatform : SourcePlatformOptions;
  }
  //#endregion
