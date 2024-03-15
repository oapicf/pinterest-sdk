namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdAccountOwner
open OpenAPI.Model.BusinessAccessRole
open OpenAPI.Model.Country
open OpenAPI.Model.Currency
open OpenAPI.Model.int option

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
    [<JsonProperty(PropertyName = "permissions")>]
    Permissions : BusinessAccessRole[];
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : int option;
    [<JsonProperty(PropertyName = "updated_time")>]
    UpdatedTime : int option;
  }

  //#endregion
