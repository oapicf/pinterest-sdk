namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsAiContentDisclosure
open OpenAPI.Model.string option

module CatalogsCreativeAssetsAttributes =

  //#region CatalogsCreativeAssetsAttributes


  type CatalogsCreativeAssetsAttributes = {
    AndroidDeepLink : string option;
    CustomLabel0 : string option;
    CustomLabel1 : string option;
    CustomLabel2 : string option;
    CustomLabel3 : string option;
    CustomLabel4 : string option;
    Description : string;
    GoogleProductCategory : string option;
    IosDeepLink : string option;
    Link : string;
    Title : string;
    Visibility : string option;
    AiDisclosures : CatalogsAiContentDisclosure[];
    ImageLink : string;
    VideoLink : string;
  }
  //#endregion
