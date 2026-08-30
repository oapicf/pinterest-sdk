namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module LeadsExports =

  //#region LeadsExports

  [<CLIMutable>]
  type LeadsExports = {
    [<JsonProperty(PropertyName = "leads_export_id")>]
    LeadsExportId : string;
  }

  //#endregion
