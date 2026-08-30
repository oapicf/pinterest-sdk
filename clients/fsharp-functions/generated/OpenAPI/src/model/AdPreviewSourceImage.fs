namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AdPreviewSourceImage =

  //#region AdPreviewSourceImage

  [<CLIMutable>]
  type AdPreviewSourceImage = {
    [<JsonProperty(PropertyName = "image_url")>]
    ImageUrl : string;
    [<JsonProperty(PropertyName = "promotion_id")>]
    PromotionId : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
  }

  //#endregion
