namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module CatalogsUpdatableCreativeAssetsAttributes =

  //#region CatalogsUpdatableCreativeAssetsAttributes


  type CatalogsUpdatableCreativeAssetsAttributes = {
    Title : string;
    Description : string;
    Link : string;
    IosDeepLink : string option;
    AndroidDeepLink : string option;
    GoogleProductCategory : string option;
    CustomLabel0 : string option;
    CustomLabel1 : string option;
    CustomLabel2 : string option;
    CustomLabel3 : string option;
    CustomLabel4 : string option;
    Visibility : string option;
  }
  //#endregion
