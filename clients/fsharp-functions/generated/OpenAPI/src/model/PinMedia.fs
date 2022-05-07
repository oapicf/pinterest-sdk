namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PinMedia =

  //#region PinMedia

  [<CLIMutable>]
  type PinMedia = {
    [<JsonProperty(PropertyName = "media_type")>]
    MediaType : string;
  }

  //#endregion
