namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType

module ConversionHealthSelectionItem =

  //#region ConversionHealthSelectionItem

  [<CLIMutable>]
  type ConversionHealthSelectionItem = {
    [<JsonProperty(PropertyName = "conversionType")>]
    ConversionType : obj;
    [<JsonProperty(PropertyName = "criteria")>]
    Criteria : obj;
    [<JsonProperty(PropertyName = "ingestionSource")>]
    IngestionSource : obj;
    [<JsonProperty(PropertyName = "status")>]
    Status : AnyType;
  }

  //#endregion
