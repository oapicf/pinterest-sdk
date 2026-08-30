namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.DiscountStatus
open OpenAPI.Model.PromotionTemplateValue
open OpenAPI.Model.PromotionType

module PromotionCreate =

  //#region PromotionCreate

  [<CLIMutable>]
  type PromotionCreate = {
    [<JsonProperty(PropertyName = "discount_status")>]
    DiscountStatus : DiscountStatus;
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
