namespace OpenAPI
open OpenAPI.Model.CustomerListUploadCreateRequest
open OpenAPI.Model.CustomerListUploadCreateResponse
open OpenAPI.Model.CustomerListUploadResponse
open OpenAPI.Model.Error
open CustomerListUploadsApiHandlerParams
open CustomerListUploadsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module CustomerListUploadsApiServiceImplementation =

    //#region Service implementation
    type CustomerListUploadsApiServiceImpl() =
      interface ICustomerListUploadsApiService with

        member this.CustomerListUploadsCreate ctx args =
          if true then
            let content = "Success" :> obj :?> CustomerListUploadCreateResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CustomerListUploadsCreateStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CustomerListUploadsCreateDefaultStatusCode { content = content }

        member this.CustomerListUploadsGet ctx args =
          if true then
            let content = "Success" :> obj :?> CustomerListUploadResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CustomerListUploadsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CustomerListUploadsGetDefaultStatusCode { content = content }

        member this.CustomerListUploadsRun ctx args =
          if true then
            let content = "Success" :> obj :?> CustomerListUploadResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CustomerListUploadsRunStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CustomerListUploadsRunDefaultStatusCode { content = content }

      //#endregion

    let CustomerListUploadsApiService = CustomerListUploadsApiServiceImpl() :> ICustomerListUploadsApiService