namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MMMReportingColumn
open OpenAPI.Model.MMMReportingTargetingType
open OpenAPI.Model.TargetingAdvertiserCountry

module CreateMMMReportRequest =

  //#region CreateMMMReportRequest

  //#region enums
  type GranularityEnum = DAYEnum of string  |  WEEKEnum of string  
  //#endregion
  //#region enums
  type LevelEnum = CAMPAIGNTARGETINGEnum of string  |  ADGROUPTARGETINGEnum of string  
  //#endregion

  type CreateMMMReportRequest = {
    ReportName : string;
    StartDate : string;
    EndDate : string;
    Granularity : GranularityEnum;
    Level : LevelEnum;
    TargetingTypes : MMMReportingTargetingType[];
    Columns : MMMReportingColumn[];
    Countries : TargetingAdvertiserCountry[];
  }
  //#endregion
