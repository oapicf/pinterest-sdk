namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DeletePartnersResponse =

  //#region DeletePartnersResponse

  [<CLIMutable>]
  type DeletePartnersResponse = {
    [<JsonProperty(PropertyName = "deleted_partners")>]
    DeletedPartners : string[];
  }

  //#endregion
