namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DeleteBusinessPartners =

  //#region DeleteBusinessPartners

  [<CLIMutable>]
  type DeleteBusinessPartners = {
    [<JsonProperty(PropertyName = "deleted_partners")>]
    DeletedPartners : string[];
  }

  //#endregion
