namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibStatus204

module CampaignAdPreviewDelete200ResponseInnerStatus =

  //#region CampaignAdPreviewDelete200ResponseInnerStatus

  //#region enums
  type StatusCodeEnum = _204Enum of decimal  
  //#endregion

  type campaign_ad_preview_delete_200_response_inner_status = {
    StatusCode : StatusCodeEnum;
    Code : int;
    Message : string;
  }
  //#endregion
