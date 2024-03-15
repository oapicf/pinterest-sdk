namespace OpenAPI
open OpenAPI.Model.CustomerList
open OpenAPI.Model.CustomerListRequest
open OpenAPI.Model.CustomerListUpdateRequest
open OpenAPI.Model.CustomerListsList200Response
open OpenAPI.Model.Error
open CustomerListsApiHandlerParams
open CustomerListsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module CustomerListsApiServiceImplementation =

    //#region Service implementation
    type CustomerListsApiServiceImpl() =
      interface ICustomerListsApiService with

        member this.CustomerListsCreate ctx args =
          if true then
            let content = "Success" :> obj :?> CustomerList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CustomerListsCreateStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CustomerListsCreateDefaultStatusCode { content = content }

        member this.CustomerListsGet ctx args =
          if true then
            let content = "Success" :> obj :?> CustomerList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CustomerListsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CustomerListsGetDefaultStatusCode { content = content }

        member this.CustomerListsList ctx args =
          if true then
            let content = "Success" :> obj :?> CustomerListsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CustomerListsListStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CustomerListsListDefaultStatusCode { content = content }

        member this.CustomerListsUpdate ctx args =
          if true then
            let content = "Success" :> obj :?> CustomerList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CustomerListsUpdateStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CustomerListsUpdateDefaultStatusCode { content = content }

      //#endregion

    let CustomerListsApiService = CustomerListsApiServiceImpl() :> ICustomerListsApiService