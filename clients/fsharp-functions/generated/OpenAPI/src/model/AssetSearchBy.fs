namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AssetSearchBy =

  //#region AssetSearchBy

  let NAMEEnum = "NAME"
  let IDEnum = "ID"
  let NAMEORIDEnum = "NAME_OR_ID"
  let OWNERNAMEEnum = "OWNER_NAME"
  let NAMEOROWNEREnum = "NAME_OR_OWNER"
  type AssetSearchBy = string

  //#endregion
