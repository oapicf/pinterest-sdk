namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.PromotionTemplateValue
open OpenAPI.Model.PromotionType

module PromotionUpdateRequest =

  //#region PromotionUpdateRequest

  //#region enums
  type DiscountStatusEnum = OTHEREnum of string  |  ACTIVEEnum of string  |  PAUSEDEnum of string  |  SCHEDULEDEnum of string  |  EXPIREDEnum of string  
  //#endregion

  type PromotionUpdateRequest = {
    DiscountStatus : DiscountStatusEnum;
    EndTime : int;
    ExternalId : string;
    PlatformType : string;
    PromotionCode : string;
    PromotionCustomId : string;
    PromotionTitle : string;
    PromotionType : PromotionType;
    StartTime : int;
    TemplateValues : PromotionTemplateValue[];
    Id : string;
    Status : EntityStatus;
  }
  //#endregion
