namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CartingRetailer =

  //#region CartingRetailer

  [<CLIMutable>]
  type CartingRetailer = {
    [<JsonProperty(PropertyName = "retailer_id")>]
    RetailerId : string;
    [<JsonProperty(PropertyName = "retailer_name")>]
    RetailerName : string;
  }

  //#endregion
