namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module ConversionEventsUserDataProperties =

  //#region ConversionEventsUserDataProperties

  [<CLIMutable>]
  type ConversionEventsUserDataProperties = {
    [<JsonProperty(PropertyName = "click_id")>]
    ClickId : string option;
    [<JsonProperty(PropertyName = "client_ip_address")>]
    ClientIpAddress : string;
    [<JsonProperty(PropertyName = "client_user_agent")>]
    ClientUserAgent : string;
    [<JsonProperty(PropertyName = "country")>]
    Country : string[];
    [<JsonProperty(PropertyName = "ct")>]
    Ct : string[];
    [<JsonProperty(PropertyName = "db")>]
    Db : string[];
    [<JsonProperty(PropertyName = "em")>]
    Em : string[];
    [<JsonProperty(PropertyName = "external_id")>]
    ExternalId : string[];
    [<JsonProperty(PropertyName = "fn")>]
    Fn : string[];
    [<JsonProperty(PropertyName = "ge")>]
    Ge : string[];
    [<JsonProperty(PropertyName = "hashed_maids")>]
    HashedMaids : string[];
    [<JsonProperty(PropertyName = "ln")>]
    Ln : string[];
    [<JsonProperty(PropertyName = "partner_id")>]
    PartnerId : string option;
    [<JsonProperty(PropertyName = "ph")>]
    Ph : string[];
    [<JsonProperty(PropertyName = "st")>]
    St : string[];
    [<JsonProperty(PropertyName = "zp")>]
    Zp : string[];
  }

  //#endregion
