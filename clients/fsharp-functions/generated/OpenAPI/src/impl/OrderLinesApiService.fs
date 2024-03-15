namespace OpenAPI
open OpenAPI.Model.Error
open OpenAPI.Model.OrderLine
open OpenAPI.Model.OrderLinesList200Response
open OrderLinesApiHandlerParams
open OrderLinesApiServiceInterface
open System.Collections.Generic
open System

module OrderLinesApiServiceImplementation =

    //#region Service implementation
    type OrderLinesApiServiceImpl() =
      interface IOrderLinesApiService with

        member this.OrderLinesGet () =
          if true then
            let content = "Success" :> obj :?> OrderLine // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OrderLinesGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OrderLinesGetDefaultStatusCode { content = content }

        member this.OrderLinesList () =
          if true then
            let content = "Success" :> obj :?> OrderLinesList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OrderLinesListStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OrderLinesListDefaultStatusCode { content = content }

      //#endregion

    let OrderLinesApiService = OrderLinesApiServiceImpl() :> IOrderLinesApiService