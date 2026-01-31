namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConversionTagConfigs
open OpenAPI.Model.EnhancedMatchStatusType
open OpenAPI.Model.decimal option

module ConversionTagCommon =

  //#region ConversionTagCommon


  type ConversionTagCommon = {
    CodeSnippet : string;
    Configs : ConversionTagConfigs;
    EnhancedMatchStatus : EnhancedMatchStatusType;
    Id : string;
    LastFiredTimeMs : decimal option;
    Name : string;
    Version : string;
  }
  //#endregion
