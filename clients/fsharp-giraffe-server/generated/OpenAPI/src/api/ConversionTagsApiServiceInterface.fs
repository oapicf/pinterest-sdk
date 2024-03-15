namespace OpenAPI
open ConversionTagsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ConversionTagsApiServiceInterface =

    //#region Service interface
    type IConversionTagsApiService =
      abstract member ConversionTagsCreate:HttpContext -> ConversionTagsCreateArgs->ConversionTagsCreateResult
      abstract member ConversionTagsGet:HttpContext -> ConversionTagsGetArgs->ConversionTagsGetResult
      abstract member ConversionTagsList:HttpContext -> ConversionTagsListArgs->ConversionTagsListResult
      abstract member OcpmEligibleConversionTagsGet:HttpContext -> OcpmEligibleConversionTagsGetArgs->OcpmEligibleConversionTagsGetResult
      abstract member PageVisitConversionTagsGet:HttpContext -> PageVisitConversionTagsGetArgs->PageVisitConversionTagsGetResult
    //#endregion