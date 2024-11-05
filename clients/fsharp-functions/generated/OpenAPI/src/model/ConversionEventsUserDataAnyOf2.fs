namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ConversionEventsUserDataAnyOf2 =

  //#region ConversionEventsUserDataAnyOf2

  [<CLIMutable>]
  type ConversionEventsUserDataAnyOf2 = {
    [<JsonProperty(PropertyName = "em")>]
    Em : string[];
    [<JsonProperty(PropertyName = "hashed_maids")>]
    HashedMaids : string[];
    [<JsonProperty(PropertyName = "client_ip_address")>]
    ClientIpAddress : string;
    [<JsonProperty(PropertyName = "client_user_agent")>]
    ClientUserAgent : string;
  }

  //#endregion
