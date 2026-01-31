namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PromotionTemplateValue
open OpenAPI.Model.PromotionType

module PromotionCommon =

  //#region PromotionCommon

  [<CLIMutable>]
  type PromotionCommon = {
    [<JsonProperty(PropertyName = "discount_status")>]
    DiscountStatus : string;
    [<JsonProperty(PropertyName = "end_time")>]
    EndTime : int;
    [<JsonProperty(PropertyName = "external_id")>]
    ExternalId : string;
    [<JsonProperty(PropertyName = "platform_type")>]
    PlatformType : string;
    [<JsonProperty(PropertyName = "promotion_code")>]
    PromotionCode : string;
    [<JsonProperty(PropertyName = "promotion_custom_id")>]
    PromotionCustomId : string;
    [<JsonProperty(PropertyName = "promotion_title")>]
    PromotionTitle : string;
    [<JsonProperty(PropertyName = "promotion_type")>]
    PromotionType : PromotionType;
    [<JsonProperty(PropertyName = "start_time")>]
    StartTime : int;
    [<JsonProperty(PropertyName = "template_values")>]
    TemplateValues : PromotionTemplateValue[];
  }

  //#endregion
