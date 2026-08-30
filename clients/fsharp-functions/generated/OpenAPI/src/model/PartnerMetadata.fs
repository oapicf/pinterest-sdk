namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PartnerMetadata =

  //#region PartnerMetadata

  [<CLIMutable>]
  type PartnerMetadata = {
    [<JsonProperty(PropertyName = "subscriber_key")>]
    SubscriberKey : string;
  }

  //#endregion
