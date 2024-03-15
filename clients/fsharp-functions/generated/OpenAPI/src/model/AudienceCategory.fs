namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AudienceSubcategory

module AudienceCategory =

  //#region AudienceCategory

  [<CLIMutable>]
  type AudienceCategory = {
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
    [<JsonProperty(PropertyName = "subcategories")>]
    Subcategories : AudienceSubcategory[];
  }

  //#endregion
