namespace OpenAPI.Tests

open System
open System.Net
open System.Net.Http
open System.IO
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.TestHost
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open Xunit
open System.Text
open TestHelper
open OpenAPI.AudienceSharingApiHandler
open OpenAPI.AudienceSharingApiHandlerParams

module AudienceSharingApiHandlerTestsHelper =

  ()

  ()

  ()


  let mutable UpdateAdAccountToAdAccountSharedAudienceExamples = Map.empty
  let mutable UpdateAdAccountToAdAccountSharedAudienceBody = ""

  UpdateAdAccountToAdAccountSharedAudienceBody <- WebUtility.HtmlDecode "{
  &quot;recipient_account_ids&quot; : [ &quot;recipient_account_ids&quot;, &quot;recipient_account_ids&quot; ],
  &quot;operation_type&quot; : &quot;SHARE&quot;,
  &quot;audience_id&quot; : &quot;2542621871096&quot;
}"
  UpdateAdAccountToAdAccountSharedAudienceExamples <- UpdateAdAccountToAdAccountSharedAudienceExamples.Add("application/json", UpdateAdAccountToAdAccountSharedAudienceBody)

  let getUpdateAdAccountToAdAccountSharedAudienceExample mediaType =
    UpdateAdAccountToAdAccountSharedAudienceExamples.[mediaType]
      |> getConverter mediaType

  let mutable UpdateAdAccountToBusinessSharedAudienceExamples = Map.empty
  let mutable UpdateAdAccountToBusinessSharedAudienceBody = ""

  UpdateAdAccountToBusinessSharedAudienceBody <- WebUtility.HtmlDecode "{
  &quot;operation_type&quot; : &quot;SHARE&quot;,
  &quot;recipient_business_ids&quot; : [ &quot;recipient_business_ids&quot;, &quot;recipient_business_ids&quot; ],
  &quot;audience_id&quot; : &quot;2542621871096&quot;
}"
  UpdateAdAccountToBusinessSharedAudienceExamples <- UpdateAdAccountToBusinessSharedAudienceExamples.Add("application/json", UpdateAdAccountToBusinessSharedAudienceBody)

  let getUpdateAdAccountToBusinessSharedAudienceExample mediaType =
    UpdateAdAccountToBusinessSharedAudienceExamples.[mediaType]
      |> getConverter mediaType

  let mutable UpdateBusinessToAdAccountSharedAudienceExamples = Map.empty
  let mutable UpdateBusinessToAdAccountSharedAudienceBody = ""

  UpdateBusinessToAdAccountSharedAudienceBody <- WebUtility.HtmlDecode "{
  &quot;recipient_account_ids&quot; : [ &quot;recipient_account_ids&quot;, &quot;recipient_account_ids&quot; ],
  &quot;operation_type&quot; : &quot;SHARE&quot;,
  &quot;audience_id&quot; : &quot;2542621871096&quot;
}"
  UpdateBusinessToAdAccountSharedAudienceExamples <- UpdateBusinessToAdAccountSharedAudienceExamples.Add("application/json", UpdateBusinessToAdAccountSharedAudienceBody)

  let getUpdateBusinessToAdAccountSharedAudienceExample mediaType =
    UpdateBusinessToAdAccountSharedAudienceExamples.[mediaType]
      |> getConverter mediaType

  let mutable UpdateBusinessToBusinessSharedAudienceExamples = Map.empty
  let mutable UpdateBusinessToBusinessSharedAudienceBody = ""

  UpdateBusinessToBusinessSharedAudienceBody <- WebUtility.HtmlDecode "{
  &quot;operation_type&quot; : &quot;SHARE&quot;,
  &quot;recipient_business_ids&quot; : [ &quot;recipient_business_ids&quot;, &quot;recipient_business_ids&quot; ],
  &quot;audience_id&quot; : &quot;2542621871096&quot;
}"
  UpdateBusinessToBusinessSharedAudienceExamples <- UpdateBusinessToBusinessSharedAudienceExamples.Add("application/json", UpdateBusinessToBusinessSharedAudienceBody)

  let getUpdateBusinessToBusinessSharedAudienceExample mediaType =
    UpdateBusinessToBusinessSharedAudienceExamples.[mediaType]
      |> getConverter mediaType
