namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConversionTagType

module ConversionEventResponse =

  //#region ConversionEventResponse

  [<CLIMutable>]
  type ConversionEventResponse = {
    [<JsonProperty(PropertyName = "conversion_event")>]
    ConversionEvent : ConversionTagType;
    [<JsonProperty(PropertyName = "conversion_tag_id")>]
    ConversionTagId : string;
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : int;
  }

  //#endregion
