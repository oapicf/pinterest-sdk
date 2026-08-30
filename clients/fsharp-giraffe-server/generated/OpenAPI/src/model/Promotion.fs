namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.DiscountStatus
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.PromotionTemplateValue
open OpenAPI.Model.PromotionType

module Promotion =

  //#region Promotion


  type Promotion = {
    AdAccountId : string;
    DiscountStatus : DiscountStatus;
    EndTime : int;
    ExternalId : string;
    Id : string;
    PlatformType : string;
    PromotionCode : string;
    PromotionCustomId : string;
    PromotionTitle : string;
    PromotionType : PromotionType;
    StartTime : int;
    Status : EntityStatus;
    TemplateValues : PromotionTemplateValue[];
  }
  //#endregion
