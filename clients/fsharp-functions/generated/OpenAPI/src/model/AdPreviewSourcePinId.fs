namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdPinPreviewCreativeType

module AdPreviewSourcePinId =

  //#region AdPreviewSourcePinId

  [<CLIMutable>]
  type AdPreviewSourcePinId = {
    [<JsonProperty(PropertyName = "creative_type")>]
    CreativeType : AdPinPreviewCreativeType;
    [<JsonProperty(PropertyName = "pin_id")>]
    PinId : string;
  }

  //#endregion
