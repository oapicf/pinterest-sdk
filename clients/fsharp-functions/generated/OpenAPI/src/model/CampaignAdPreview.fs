namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CampaignAdPreview =

  //#region CampaignAdPreview

  [<CLIMutable>]
  type CampaignAdPreview = {
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "ad_group_id")>]
    AdGroupId : string;
    [<JsonProperty(PropertyName = "client_id")>]
    ClientId : int;
    [<JsonProperty(PropertyName = "expires_at")>]
    ExpiresAt : int;
    [<JsonProperty(PropertyName = "is_active")>]
    IsActive : bool;
    [<JsonProperty(PropertyName = "pin_id")>]
    PinId : int;
    [<JsonProperty(PropertyName = "pin_promotion_id")>]
    PinPromotionId : int;
    [<JsonProperty(PropertyName = "promoted_product_group_id")>]
    PromotedProductGroupId : int;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
    [<JsonProperty(PropertyName = "user_id")>]
    UserId : int;
    [<JsonProperty(PropertyName = "uuid")>]
    Uuid : string;
  }

  //#endregion
