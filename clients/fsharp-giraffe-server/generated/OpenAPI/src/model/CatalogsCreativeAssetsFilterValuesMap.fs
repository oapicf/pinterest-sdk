namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsCreativeAssetsFilterValuesMap =

  //#region CatalogsCreativeAssetsFilterValuesMap

  //#region enums
  type MediaTypeEnum[] = IMAGEEnum of string[]  |  VIDEOEnum of string[]  
  //#endregion

  type catalogs_creative_assets_filter_values_map = {
    CustomLabel0 : string[];
    CustomLabel1 : string[];
    CustomLabel2 : string[];
    CustomLabel3 : string[];
    CustomLabel4 : string[];
    GoogleProductCategory0 : string[];
    GoogleProductCategory1 : string[];
    GoogleProductCategory2 : string[];
    GoogleProductCategory3 : string[];
    GoogleProductCategory4 : string[];
    GoogleProductCategory5 : string[];
    GoogleProductCategory6 : string[];
    MediaType : MediaTypeEnum[];
  }
  //#endregion
