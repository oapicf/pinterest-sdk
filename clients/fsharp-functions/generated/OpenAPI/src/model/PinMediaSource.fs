namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ContentType
open OpenAPI.Model.PinMediaSourceImageBase64
open OpenAPI.Model.PinMediaSourceImageURL
open OpenAPI.Model.PinMediaSourceImagesBase64
open OpenAPI.Model.PinMediaSourceImagesURL
open OpenAPI.Model.PinMediaSourceImagesURLItem
open OpenAPI.Model.PinMediaSourcePinURL
open OpenAPI.Model.PinMediaSourceVideoID

module PinMediaSource =

  //#region PinMediaSource

  [<CLIMutable>]
  type PinMediaSource = {
    [<JsonProperty(PropertyName = "content_type")>]
    ContentType : ContentType;
    [<JsonProperty(PropertyName = "data")>]
    Data : string;
    [<JsonProperty(PropertyName = "is_standard")>]
    IsStandard : bool;
    [<JsonProperty(PropertyName = "source_type")>]
    SourceType : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
    [<JsonProperty(PropertyName = "cover_image_content_type")>]
    CoverImageContentType : ContentType;
    [<JsonProperty(PropertyName = "cover_image_data")>]
    CoverImageData : string;
    [<JsonProperty(PropertyName = "cover_image_key_frame_time")>]
    CoverImageKeyFrameTime : int;
    [<JsonProperty(PropertyName = "cover_image_url")>]
    CoverImageUrl : string;
    [<JsonProperty(PropertyName = "media_id")>]
    MediaId : string;
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
    [<JsonProperty(PropertyName = "items")>]
    Items : PinMediaSourceImagesURLItem[];
    [<JsonProperty(PropertyName = "is_affiliate_link")>]
    IsAffiliateLink : bool;
  }

  //#endregion
