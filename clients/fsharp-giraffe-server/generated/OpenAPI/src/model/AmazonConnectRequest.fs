namespace OpenAPI.Model

open System
open System.Collections.Generic

module AmazonConnectRequest =

  //#region AmazonConnectRequest


  type AmazonConnectRequest = {
    AmazonStorefrontId : string;
    AmazonStorefrontName : string;
    AmazonStorefrontUrl : string;
    AmazonUserId : string;
    IsAmazonAccountLinked : bool;
    OneTimePasscode : string;
    PinterestUserId : string;
  }
  //#endregion
