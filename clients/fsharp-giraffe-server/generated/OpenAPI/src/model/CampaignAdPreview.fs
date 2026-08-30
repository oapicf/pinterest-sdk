namespace OpenAPI.Model

open System
open System.Collections.Generic

module CampaignAdPreview =

  //#region CampaignAdPreview


  type CampaignAdPreview = {
    AdAccountId : string;
    AdGroupId : string;
    ClientId : int;
    ExpiresAt : int;
    IsActive : bool;
    PinId : int;
    PinPromotionId : int;
    PromotedProductGroupId : int;
    Url : string;
    UserId : int;
    Uuid : string;
  }
  //#endregion
