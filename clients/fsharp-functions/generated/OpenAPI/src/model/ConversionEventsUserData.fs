namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module ConversionEventsUserData =

  //#region ConversionEventsUserData

  [<CLIMutable>]
  type ConversionEventsUserData = {
    [<JsonProperty(PropertyName = "ph")>]
    Ph : string[];
    [<JsonProperty(PropertyName = "ge")>]
    Ge : string[];
    [<JsonProperty(PropertyName = "db")>]
    Db : string[];
    [<JsonProperty(PropertyName = "ln")>]
    Ln : string[];
    [<JsonProperty(PropertyName = "fn")>]
    Fn : string[];
    [<JsonProperty(PropertyName = "ct")>]
    Ct : string[];
    [<JsonProperty(PropertyName = "st")>]
    St : string[];
    [<JsonProperty(PropertyName = "zp")>]
    Zp : string[];
    [<JsonProperty(PropertyName = "country")>]
    Country : string[];
    [<JsonProperty(PropertyName = "external_id")>]
    ExternalId : string[];
    [<JsonProperty(PropertyName = "click_id")>]
    ClickId : string option;
    [<JsonProperty(PropertyName = "partner_id")>]
    PartnerId : string option;
  }

  //#endregion
