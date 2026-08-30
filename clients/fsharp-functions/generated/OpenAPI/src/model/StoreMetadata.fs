namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module StoreMetadata =

  //#region StoreMetadata

  [<CLIMutable>]
  type StoreMetadata = {
    [<JsonProperty(PropertyName = "geohash")>]
    Geohash : string;
    [<JsonProperty(PropertyName = "latitude")>]
    Latitude : double;
    [<JsonProperty(PropertyName = "longitude")>]
    Longitude : double;
    [<JsonProperty(PropertyName = "store_code")>]
    StoreCode : string;
    [<JsonProperty(PropertyName = "store_id")>]
    StoreId : string;
    [<JsonProperty(PropertyName = "store_name")>]
    StoreName : string;
  }

  //#endregion
