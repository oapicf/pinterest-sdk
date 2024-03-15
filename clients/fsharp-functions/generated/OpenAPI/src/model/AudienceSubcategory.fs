namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AudienceSubcategory =

  //#region AudienceSubcategory

  [<CLIMutable>]
  type AudienceSubcategory = {
    [<JsonProperty(PropertyName = "key")>]
    Key : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "ratio")>]
    Ratio : decimal;
    [<JsonProperty(PropertyName = "index")>]
    Index : decimal;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
  }

  //#endregion
