namespace OpenAPI

open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder
open OpenAPI.Model.Schedule
open OpenAPI.Model.ScheduleBatchUpdate
open OpenAPI.Model.ScheduleCreate
open OpenAPI.Model.ScheduleStatus
open OpenAPI.Model.ScheduleType
open OpenAPI.Model.SchedulesCreate200ResponseInner
open OpenAPI.Model.SchedulesList200Response
open System.Collections.Generic
open System

module SchedulesApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type SchedulesCreatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type SchedulesCreateBodyParams = ScheduleCreate[]
    //#endregion


    type SchedulesCreateStatusCode200Response = {
      content:SchedulesCreate200ResponseInner[];
      
    }

    type SchedulesCreateStatusCode201Response = {
      content:Schedule[];
      
    }

    type SchedulesCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type SchedulesCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type SchedulesCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type SchedulesCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type SchedulesCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type SchedulesCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type SchedulesCreateResult = SchedulesCreateStatusCode200 of SchedulesCreateStatusCode200Response|SchedulesCreateStatusCode201 of SchedulesCreateStatusCode201Response|SchedulesCreateStatusCode400 of SchedulesCreateStatusCode400Response|SchedulesCreateStatusCode401 of SchedulesCreateStatusCode401Response|SchedulesCreateStatusCode403 of SchedulesCreateStatusCode403Response|SchedulesCreateStatusCode404 of SchedulesCreateStatusCode404Response|SchedulesCreateStatusCode429 of SchedulesCreateStatusCode429Response|SchedulesCreateDefaultStatusCode of SchedulesCreateDefaultStatusCodeResponse

    type SchedulesCreateArgs = {
      pathParams:SchedulesCreatePathParams;
      bodyParams:SchedulesCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type SchedulesListPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type SchedulesListQueryParams = {
      bookmark : string option;


      pageSize : int option;


      order : PinterestLibPaginationOrder option;


      scheduleStatuses : ScheduleStatus[] option;


      scheduleType : ScheduleType option;


      entityIds : string[] ;

    }
    //#endregion


    type SchedulesListStatusCode200Response = {
      content:SchedulesList200Response;
      
    }

    type SchedulesListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type SchedulesListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type SchedulesListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type SchedulesListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type SchedulesListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type SchedulesListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type SchedulesListResult = SchedulesListStatusCode200 of SchedulesListStatusCode200Response|SchedulesListStatusCode400 of SchedulesListStatusCode400Response|SchedulesListStatusCode401 of SchedulesListStatusCode401Response|SchedulesListStatusCode403 of SchedulesListStatusCode403Response|SchedulesListStatusCode404 of SchedulesListStatusCode404Response|SchedulesListStatusCode429 of SchedulesListStatusCode429Response|SchedulesListDefaultStatusCode of SchedulesListDefaultStatusCodeResponse

    type SchedulesListArgs = {
      pathParams:SchedulesListPathParams;
      queryParams:Result<SchedulesListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type SchedulesUpdatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type SchedulesUpdateBodyParams = ScheduleBatchUpdate[]
    //#endregion


    type SchedulesUpdateStatusCode200Response = {
      content:SchedulesCreate200ResponseInner[];
      
    }

    type SchedulesUpdateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type SchedulesUpdateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type SchedulesUpdateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type SchedulesUpdateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type SchedulesUpdateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type SchedulesUpdateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type SchedulesUpdateResult = SchedulesUpdateStatusCode200 of SchedulesUpdateStatusCode200Response|SchedulesUpdateStatusCode400 of SchedulesUpdateStatusCode400Response|SchedulesUpdateStatusCode401 of SchedulesUpdateStatusCode401Response|SchedulesUpdateStatusCode403 of SchedulesUpdateStatusCode403Response|SchedulesUpdateStatusCode404 of SchedulesUpdateStatusCode404Response|SchedulesUpdateStatusCode429 of SchedulesUpdateStatusCode429Response|SchedulesUpdateDefaultStatusCode of SchedulesUpdateDefaultStatusCodeResponse

    type SchedulesUpdateArgs = {
      pathParams:SchedulesUpdatePathParams;
      bodyParams:SchedulesUpdateBodyParams
    }
