namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsRetailFilterValuesMap =

  //#region CatalogsRetailFilterValuesMap

  //#region enums
  type AvailabilityEnum[] = INSTOCKEnum of string[]  |  OUTOFSTOCKEnum of string[]  |  PREORDEREnum of string[]  |  UNAVAILABLEEnum of string[]  
  //#endregion
  //#region enums
  type ConditionEnum[] = NEWEnum of string[]  |  USEDEnum of string[]  |  REFURBISHEDEnum of string[]  
  //#endregion
  //#region enums
  type GenderEnum[] = FEMALEEnum of string[]  |  MALEEnum of string[]  |  UNISEXEnum of string[]  
  //#endregion
  //#region enums
  type MediaTypeEnum[] = IMAGEEnum of string[]  |  VIDEOEnum of string[]  
  //#endregion

  type catalogs_retail_filter_values_map = {
    AdImageTags : string[];
    AdVideoTags : string[];
    Availability : AvailabilityEnum[];
    Brand : string[];
    Condition : ConditionEnum[];
    CustomLabel0 : string[];
    CustomLabel1 : string[];
    CustomLabel2 : string[];
    CustomLabel3 : string[];
    CustomLabel4 : string[];
    Gender : GenderEnum[];
    GoogleProductCategory0 : string[];
    GoogleProductCategory1 : string[];
    GoogleProductCategory2 : string[];
    GoogleProductCategory3 : string[];
    GoogleProductCategory4 : string[];
    GoogleProductCategory5 : string[];
    GoogleProductCategory6 : string[];
    MediaType : MediaTypeEnum[];
    ProductType0 : string[];
    ProductType1 : string[];
    ProductType2 : string[];
    ProductType3 : string[];
    ProductType4 : string[];
  }
  //#endregion
