namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AdGroupIdFilter =

  //#region AdGroupIdFilter

  [<CLIMutable>]
  type AdGroupIdFilter = {
    [<JsonProperty(PropertyName = "ad_group_ids")>]
    AdGroupIds : string[];
  }

  //#endregion
