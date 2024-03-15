namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PinMediaSourceImageBase64
open OpenAPI.Model.PinMediaSourceImageURL
open OpenAPI.Model.PinMediaSourceImagesBase64
open OpenAPI.Model.PinMediaSourceImagesURL
open OpenAPI.Model.PinMediaSourceImagesURLItemsInner
open OpenAPI.Model.PinMediaSourcePinURL
open OpenAPI.Model.PinMediaSourceVideoID

module PinMediaSource =

  //#region PinMediaSource

  [<CLIMutable>]
  type PinMediaSource = {
    [<JsonProperty(PropertyName = "source_type")>]
    SourceType : string;
    [<JsonProperty(PropertyName = "content_type")>]
    ContentType : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : string;
    [<JsonProperty(PropertyName = "is_standard")>]
    IsStandard : bool;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
    [<JsonProperty(PropertyName = "cover_image_url")>]
    CoverImageUrl : string;
    [<JsonProperty(PropertyName = "cover_image_content_type")>]
    CoverImageContentType : string;
    [<JsonProperty(PropertyName = "cover_image_data")>]
    CoverImageData : string;
    [<JsonProperty(PropertyName = "media_id")>]
    MediaId : string;
    [<JsonProperty(PropertyName = "items")>]
    Items : PinMediaSourceImagesURLItemsInner[];
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
    [<JsonProperty(PropertyName = "is_affiliate_link")>]
    IsAffiliateLink : bool;
  }

  //#endregion
