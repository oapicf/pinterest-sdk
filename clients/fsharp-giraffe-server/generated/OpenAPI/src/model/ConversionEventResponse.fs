namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConversionTagType

module ConversionEventResponse =

  //#region ConversionEventResponse


  type ConversionEventResponse = {
    ConversionEvent : ConversionTagType;
    ConversionTagId : string;
    AdAccountId : string;
    CreatedTime : int;
  }
  //#endregion
