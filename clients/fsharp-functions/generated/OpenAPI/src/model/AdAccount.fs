namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdAccountOwner
open OpenAPI.Model.Country
open OpenAPI.Model.Currency

module AdAccount =

  //#region AdAccount

  [<CLIMutable>]
  type AdAccount = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "owner")>]
    Owner : AdAccountOwner;
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "currency")>]
    Currency : Currency;
  }

  //#endregion
