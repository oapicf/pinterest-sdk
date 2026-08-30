namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AdsCreditRedeemCreate =

  //#region AdsCreditRedeemCreate

  [<CLIMutable>]
  type AdsCreditRedeemCreate = {
    [<JsonProperty(PropertyName = "offerCodeHash")>]
    OfferCodeHash : string;
    [<JsonProperty(PropertyName = "validateOnly")>]
    ValidateOnly : bool;
  }

  //#endregion
