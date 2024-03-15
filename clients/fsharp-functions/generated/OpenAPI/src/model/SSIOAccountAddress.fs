namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module SSIOAccountAddress =

  //#region SSIOAccountAddress

  [<CLIMutable>]
  type SSIOAccountAddress = {
    [<JsonProperty(PropertyName = "display")>]
    Display : string;
    [<JsonProperty(PropertyName = "purpose")>]
    Purpose : string;
    [<JsonProperty(PropertyName = "address_id")>]
    AddressId : string;
    [<JsonProperty(PropertyName = "order_legal_entity")>]
    OrderLegalEntity : string;
  }

  //#endregion
