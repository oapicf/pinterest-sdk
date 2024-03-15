namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdCountry

module AdAccountsCountryResponseData =

  //#region AdAccountsCountryResponseData

  [<CLIMutable>]
  type AdAccountsCountryResponseData = {
    [<JsonProperty(PropertyName = "code")>]
    Code : AdCountry;
    [<JsonProperty(PropertyName = "currency")>]
    Currency : string;
    [<JsonProperty(PropertyName = "index")>]
    Index : decimal;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
