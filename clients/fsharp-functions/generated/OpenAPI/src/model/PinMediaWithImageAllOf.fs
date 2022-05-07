namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ImageDetails
open System.Collections.Generic

module PinMediaWithImageAllOf =

  //#region PinMediaWithImageAllOf

  [<CLIMutable>]
  type PinMediaWithImageAllOf = {
    [<JsonProperty(PropertyName = "images")>]
    Images : IDictionary<string, ImageDetails>;
  }

  //#endregion
