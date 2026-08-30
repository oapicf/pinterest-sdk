namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MMMReportGranularity
open OpenAPI.Model.MMMReportLevel
open OpenAPI.Model.MMMReportingColumn
open OpenAPI.Model.MMMReportingTargetingType
open OpenAPI.Model.TargetingAdvertiserCountry

module MMMReportCreate =

  //#region MMMReportCreate


  type MMMReportCreate = {
    AdvertiserIds : string[];
    Columns : MMMReportingColumn[];
    Countries : TargetingAdvertiserCountry[];
    CustomColumnIds : string[];
    EndDate : string;
    Granularity : MMMReportGranularity;
    Level : MMMReportLevel;
    ReportName : string;
    StartDate : string;
    TargetingTypes : MMMReportingTargetingType[];
  }
  //#endregion
