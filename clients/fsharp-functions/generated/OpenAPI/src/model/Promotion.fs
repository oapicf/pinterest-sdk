namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.DiscountStatus
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.PromotionTemplateValue
open OpenAPI.Model.PromotionType

module Promotion =

  //#region Promotion

  [<CLIMutable>]
  type Promotion = {
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "discount_status")>]
    DiscountStatus : DiscountStatus;
    [<JsonProperty(PropertyName = "end_time")>]
    EndTime : int;
    [<JsonProperty(PropertyName = "external_id")>]
    ExternalId : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
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
    [<JsonProperty(PropertyName = "status")>]
    Status : EntityStatus;
    [<JsonProperty(PropertyName = "template_values")>]
    TemplateValues : PromotionTemplateValue[];
  }

  //#endregion
