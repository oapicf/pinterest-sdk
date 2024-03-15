namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module LinkedBusiness =

  //#region LinkedBusiness

  [<CLIMutable>]
  type LinkedBusiness = {
    [<JsonProperty(PropertyName = "username")>]
    Username : string;
    [<JsonProperty(PropertyName = "image_small_url")>]
    ImageSmallUrl : string;
    [<JsonProperty(PropertyName = "image_medium_url")>]
    ImageMediumUrl : string;
    [<JsonProperty(PropertyName = "image_large_url")>]
    ImageLargeUrl : string;
    [<JsonProperty(PropertyName = "image_xlarge_url")>]
    ImageXlargeUrl : string;
  }

  //#endregion
