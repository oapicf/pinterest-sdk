namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.NullablePartnerType

module DeleteBusinessPartnersDelete =

  //#region DeleteBusinessPartnersDelete

  [<CLIMutable>]
  type DeleteBusinessPartnersDelete = {
    [<JsonProperty(PropertyName = "partner_ids")>]
    PartnerIds : string[];
    [<JsonProperty(PropertyName = "partner_type")>]
    PartnerType : NullablePartnerType;
  }

  //#endregion
