namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module LeadsExportCreateRequest =

  //#region LeadsExportCreateRequest

  [<CLIMutable>]
  type LeadsExportCreateRequest = {
    [<JsonProperty(PropertyName = "ad_id")>]
    AdId : string;
    [<JsonProperty(PropertyName = "end_date")>]
    EndDate : string;
    [<JsonProperty(PropertyName = "start_date")>]
    StartDate : string;
  }

  //#endregion
