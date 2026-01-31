namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PromotionTemplateValue
open OpenAPI.Model.PromotionType

module PromotionCommon =

  //#region PromotionCommon

  //#region enums
  type DiscountStatusEnum = OTHEREnum of string  |  ACTIVEEnum of string  |  PAUSEDEnum of string  |  SCHEDULEDEnum of string  |  EXPIREDEnum of string  
  //#endregion

  type PromotionCommon = {
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
  }
  //#endregion
