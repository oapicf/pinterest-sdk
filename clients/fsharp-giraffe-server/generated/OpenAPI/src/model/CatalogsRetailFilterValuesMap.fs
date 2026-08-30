namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Gender
open OpenAPI.Model.MediaType
open OpenAPI.Model.ProductAvailability
open OpenAPI.Model.ProductCondition

module CatalogsRetailFilterValuesMap =

  //#region CatalogsRetailFilterValuesMap


  type CatalogsRetailFilterValuesMap = {
    AdImageTags : string[];
    AdVideoTags : string[];
    Availability : ProductAvailability[];
    Brand : string[];
    Condition : ProductCondition[];
    CustomLabel0 : string[];
    CustomLabel1 : string[];
    CustomLabel2 : string[];
    CustomLabel3 : string[];
    CustomLabel4 : string[];
    Gender : Gender[];
    GoogleProductCategory0 : string[];
    GoogleProductCategory1 : string[];
    GoogleProductCategory2 : string[];
    GoogleProductCategory3 : string[];
    GoogleProductCategory4 : string[];
    GoogleProductCategory5 : string[];
    GoogleProductCategory6 : string[];
    MediaType : MediaType[];
    ProductType0 : string[];
    ProductType1 : string[];
    ProductType2 : string[];
    ProductType3 : string[];
    ProductType4 : string[];
  }
  //#endregion
