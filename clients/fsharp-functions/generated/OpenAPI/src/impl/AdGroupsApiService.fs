namespace OpenAPI
open OpenAPI.Model.AdGroupArrayResponse
open OpenAPI.Model.AdGroupAudienceSizingRequest
open OpenAPI.Model.AdGroupAudienceSizingResponse
open OpenAPI.Model.AdGroupCreateRequest
open OpenAPI.Model.AdGroupResponse
open OpenAPI.Model.AdGroupUpdateRequest
open OpenAPI.Model.AdGroupsAnalyticsResponseInner
open OpenAPI.Model.AdGroupsList200Response
open OpenAPI.Model.AdsAnalyticsTargetingType
open OpenAPI.Model.BidFloor
open OpenAPI.Model.BidFloorRequest
open OpenAPI.Model.ConversionReportAttributionType
open OpenAPI.Model.Error
open OpenAPI.Model.Granularity
open OpenAPI.Model.MetricsResponse
open AdGroupsApiHandlerParams
open AdGroupsApiServiceInterface
open System.Collections.Generic
open System

module AdGroupsApiServiceImplementation =

    //#region Service implementation
    type AdGroupsApiServiceImpl() =
      interface IAdGroupsApiService with

        member this.AdGroupsAnalytics () =
          if true then
            let content = "Success" :> obj :?> AdGroupsAnalyticsResponseInner[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdGroupsAnalyticsStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account group analytics parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdGroupsAnalyticsStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdGroupsAnalyticsDefaultStatusCode { content = content }

        member this.AdGroupsAudienceSizing (parameters:AdGroupsAudienceSizingBodyParams) =
          if true then
            let content = "Success" :> obj :?> AdGroupAudienceSizingResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdGroupsAudienceSizingStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad group audience sizing parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdGroupsAudienceSizingStatusCode400 { content = content }
          else if true then
            let content = "No access to requested audience list or product group." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdGroupsAudienceSizingStatusCode403 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdGroupsAudienceSizingDefaultStatusCode { content = content }

        member this.AdGroupsBidFloorGet (parameters:AdGroupsBidFloorGetBodyParams) =
          if true then
            let content = "Success" :> obj :?> BidFloor // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdGroupsBidFloorGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdGroupsBidFloorGetDefaultStatusCode { content = content }

        member this.AdGroupsCreate (parameters:AdGroupsCreateBodyParams) =
          if true then
            let content = "Success" :> obj :?> AdGroupArrayResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdGroupsCreateStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdGroupsCreateDefaultStatusCode { content = content }

        member this.AdGroupsGet () =
          if true then
            let content = "Success" :> obj :?> AdGroupResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdGroupsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdGroupsGetDefaultStatusCode { content = content }

        member this.AdGroupsList () =
          if true then
            let content = "Success" :> obj :?> AdGroupsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdGroupsListStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account group parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdGroupsListStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdGroupsListDefaultStatusCode { content = content }

        member this.AdGroupsTargetingAnalyticsGet () =
          if true then
            let content = "Success" :> obj :?> MetricsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdGroupsTargetingAnalyticsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdGroupsTargetingAnalyticsGetDefaultStatusCode { content = content }

        member this.AdGroupsUpdate (parameters:AdGroupsUpdateBodyParams) =
          if true then
            let content = "Success" :> obj :?> AdGroupArrayResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdGroupsUpdateStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdGroupsUpdateDefaultStatusCode { content = content }

      //#endregion

    let AdGroupsApiService = AdGroupsApiServiceImpl() :> IAdGroupsApiService