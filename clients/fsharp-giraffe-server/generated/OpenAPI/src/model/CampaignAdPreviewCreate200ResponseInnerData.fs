namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CampaignAdPreview
open OpenAPI.Model.CampaignAdPreviewCreate200ResponseInnerDataOneOf
open OpenAPI.Model.PinterestLibError

module CampaignAdPreviewCreate200ResponseInnerData =

  //#region CampaignAdPreviewCreate200ResponseInnerData


  type campaign_ad_preview_create_200_response_inner_data = {
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
    Exceptions : PinterestLibError;
  }
  //#endregion
