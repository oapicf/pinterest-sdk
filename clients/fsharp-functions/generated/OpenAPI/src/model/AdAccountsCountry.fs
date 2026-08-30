namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Country

module AdAccountsCountry =

  //#region AdAccountsCountry

  [<CLIMutable>]
  type AdAccountsCountry = {
    [<JsonProperty(PropertyName = "code")>]
    Code : Country;
    [<JsonProperty(PropertyName = "currency")>]
    Currency : string;
    [<JsonProperty(PropertyName = "index")>]
    Index : decimal;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
