namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AmazonConnectRequest =

  //#region AmazonConnectRequest

  [<CLIMutable>]
  type AmazonConnectRequest = {
    [<JsonProperty(PropertyName = "amazon_storefront_id")>]
    AmazonStorefrontId : string;
    [<JsonProperty(PropertyName = "amazon_storefront_name")>]
    AmazonStorefrontName : string;
    [<JsonProperty(PropertyName = "amazon_storefront_url")>]
    AmazonStorefrontUrl : string;
    [<JsonProperty(PropertyName = "amazon_user_id")>]
    AmazonUserId : string;
    [<JsonProperty(PropertyName = "is_amazon_account_linked")>]
    IsAmazonAccountLinked : bool;
    [<JsonProperty(PropertyName = "one_time_passcode")>]
    OneTimePasscode : string;
    [<JsonProperty(PropertyName = "pinterest_user_id")>]
    PinterestUserId : string;
  }

  //#endregion
