namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConversionTagType

module ConversionEventResponse =

  //#region ConversionEventResponse


  type ConversionEventResponse = {
    AdAccountId : string;
    ConversionEvent : ConversionTagType;
    ConversionTagId : string;
    CreatedTime : int;
    ReportingConversionEvent : string;
  }
  //#endregion
