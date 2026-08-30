namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DynamicTitlesDownloadCSV =

  //#region DynamicTitlesDownloadCSV

  [<CLIMutable>]
  type DynamicTitlesDownloadCSV = {
    [<JsonProperty(PropertyName = "download_url")>]
    DownloadUrl : string;
  }

  //#endregion
