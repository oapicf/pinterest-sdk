namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CustomerSegmentCreate =

  //#region CustomerSegmentCreate

  [<CLIMutable>]
  type CustomerSegmentCreate = {
    [<JsonProperty(PropertyName = "audience_ids")>]
    AudienceIds : string[];
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
