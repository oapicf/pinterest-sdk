namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CarouselSlot =

  //#region CarouselSlot

  [<CLIMutable>]
  type CarouselSlot = {
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "link")>]
    Link : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
  }

  //#endregion
