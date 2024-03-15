namespace OpenAPI
open ConversionTagsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ConversionTagsApiServiceInterface =

    //#region Service interface
    type IConversionTagsApiService =
      abstract member ConversionTagsCreate : ConversionTagsCreateBodyParams -> ConversionTagsCreateResult
      abstract member ConversionTagsGet : unit -> ConversionTagsGetResult
      abstract member ConversionTagsList : unit -> ConversionTagsListResult
      abstract member OcpmEligibleConversionTagsGet : unit -> OcpmEligibleConversionTagsGetResult
      abstract member PageVisitConversionTagsGet : unit -> PageVisitConversionTagsGetResult
    //#endregion