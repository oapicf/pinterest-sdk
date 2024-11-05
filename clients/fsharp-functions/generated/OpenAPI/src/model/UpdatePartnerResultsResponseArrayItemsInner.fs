namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BusinessAccessError
open OpenAPI.Model.string option

module UpdatePartnerResultsResponseArrayItemsInner =

  //#region UpdatePartnerResultsResponseArrayItemsInner

  [<CLIMutable>]
  type UpdatePartnerResultsResponseArrayItemsInner = {
    [<JsonProperty(PropertyName = "exception")>]
    Exception : BusinessAccessError;
    [<JsonProperty(PropertyName = "member_or_partner_id")>]
    MemberOrPartnerId : string option;
  }

  //#endregion
