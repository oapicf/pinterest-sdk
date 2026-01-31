namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConversionTagConfigs
open OpenAPI.Model.EnhancedMatchStatusType
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.decimal option

module ConversionTagResponse =

  //#region ConversionTagResponse


  type ConversionTagResponse = {
    CodeSnippet : string;
    Configs : ConversionTagConfigs;
    EnhancedMatchStatus : EnhancedMatchStatusType;
    Id : string;
    LastFiredTimeMs : decimal option;
    Name : string;
    Version : string;
    AdAccountId : string;
    Status : EntityStatus;
  }
  //#endregion
