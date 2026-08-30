namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Country
open OpenAPI.Model.Currency

module AdAccountCreate =

  //#region AdAccountCreate

  [<CLIMutable>]
  type AdAccountCreate = {
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "currency")>]
    Currency : Currency;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "owner_user_id")>]
    OwnerUserId : string;
    [<JsonProperty(PropertyName = "time_zone")>]
    TimeZone : string;
  }

  //#endregion
