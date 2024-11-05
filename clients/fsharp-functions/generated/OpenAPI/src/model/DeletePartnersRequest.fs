namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module DeletePartnersRequest =

  //#region DeletePartnersRequest

  [<CLIMutable>]
  type DeletePartnersRequest = {
    [<JsonProperty(PropertyName = "partner_ids")>]
    PartnerIds : string[];
    [<JsonProperty(PropertyName = "partner_type")>]
    PartnerType : string option;
  }

  //#endregion
