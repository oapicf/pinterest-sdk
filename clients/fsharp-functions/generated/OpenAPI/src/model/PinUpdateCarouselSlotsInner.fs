namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PinUpdateCarouselSlotsInner =

  //#region PinUpdateCarouselSlotsInner

  [<CLIMutable>]
  type PinUpdateCarouselSlotsInner = {
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "link")>]
    Link : string;
  }

  //#endregion
