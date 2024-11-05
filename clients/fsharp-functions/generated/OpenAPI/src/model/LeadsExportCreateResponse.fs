namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module LeadsExportCreateResponse =

  //#region LeadsExportCreateResponse

  [<CLIMutable>]
  type LeadsExportCreateResponse = {
    [<JsonProperty(PropertyName = "leads_export_id")>]
    LeadsExportId : string;
  }

  //#endregion
