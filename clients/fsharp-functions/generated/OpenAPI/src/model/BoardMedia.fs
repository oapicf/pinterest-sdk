namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module BoardMedia =

  //#region BoardMedia

  [<CLIMutable>]
  type BoardMedia = {
    [<JsonProperty(PropertyName = "image_cover_url")>]
    ImageCoverUrl : string option;
    [<JsonProperty(PropertyName = "pin_thumbnail_urls")>]
    PinThumbnailUrls : string[];
  }

  //#endregion
