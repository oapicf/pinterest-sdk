namespace OpenAPI.Model

open System
open System.Collections.Generic

module AdCommonTrackingUrls =

  //#region AdCommonTrackingUrls


  type AdCommon_tracking_urls = {
    Impression : string[];
    Click : string[];
    Engagement : string[];
    BuyableButton : string[];
    AudienceVerification : string[];
  }
  //#endregion
