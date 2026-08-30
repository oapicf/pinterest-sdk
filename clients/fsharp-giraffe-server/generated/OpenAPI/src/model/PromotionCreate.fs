namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.DiscountStatus
open OpenAPI.Model.PromotionTemplateValue
open OpenAPI.Model.PromotionType

module PromotionCreate =

  //#region PromotionCreate


  type PromotionCreate = {
    DiscountStatus : DiscountStatus;
    EndTime : int;
    ExternalId : string;
    PlatformType : string;
    PromotionCode : string;
    PromotionCustomId : string;
    PromotionTitle : string;
    PromotionType : PromotionType;
    StartTime : int;
    TemplateValues : PromotionTemplateValue[];
  }
  //#endregion
