namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PinMediaSourcePinURL =

  //#region PinMediaSourcePinURL

  [<CLIMutable>]
  type PinMediaSourcePinURL = {
    [<JsonProperty(PropertyName = "source_type")>]
    SourceType : string;
    [<JsonProperty(PropertyName = "is_affiliate_link")>]
    IsAffiliateLink : bool;
  }

  //#endregion
