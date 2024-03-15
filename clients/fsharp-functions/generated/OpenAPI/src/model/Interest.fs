namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module Interest =

  //#region Interest

  [<CLIMutable>]
  type Interest = {
    [<JsonProperty(PropertyName = "canonical_url")>]
    CanonicalUrl : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "key")>]
    Key : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
