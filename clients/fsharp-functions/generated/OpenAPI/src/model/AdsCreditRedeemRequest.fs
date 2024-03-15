namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AdsCreditRedeemRequest =

  //#region AdsCreditRedeemRequest

  [<CLIMutable>]
  type AdsCreditRedeemRequest = {
    [<JsonProperty(PropertyName = "offerCodeHash")>]
    OfferCodeHash : string;
    [<JsonProperty(PropertyName = "validateOnly")>]
    ValidateOnly : bool;
  }

  //#endregion
