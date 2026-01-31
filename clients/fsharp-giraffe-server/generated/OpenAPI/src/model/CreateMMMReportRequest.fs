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
    Countries : TargetingAdvertiserCountry[];
    Columns : MMMReportingColumn[];
    EndDate : string;
    Granularity : GranularityEnum;
    Level : LevelEnum;
    ReportName : string;
    StartDate : string;
    TargetingTypes : MMMReportingTargetingType[];
  }
  //#endregion
