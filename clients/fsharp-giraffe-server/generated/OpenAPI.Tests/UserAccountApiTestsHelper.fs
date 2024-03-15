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
open OpenAPI.UserAccountApiHandler
open OpenAPI.UserAccountApiHandlerParams

module UserAccountApiHandlerTestsHelper =

  ()


  let mutable FollowUserUpdateExamples = Map.empty
  let mutable FollowUserUpdateBody = ""

  FollowUserUpdateBody <- WebUtility.HtmlDecode "{
  &quot;auto_follow&quot; : false
}"
  FollowUserUpdateExamples <- FollowUserUpdateExamples.Add("application/json", FollowUserUpdateBody)

  let getFollowUserUpdateExample mediaType =
    FollowUserUpdateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()


  let mutable VerifyWebsiteUpdateExamples = Map.empty
  let mutable VerifyWebsiteUpdateBody = ""

  VerifyWebsiteUpdateBody <- WebUtility.HtmlDecode "{
  &quot;website&quot; : &quot;pintest-website-12345678.test/test_1&quot;,
  &quot;verification_method&quot; : &quot;METATAG&quot;
}"
  VerifyWebsiteUpdateExamples <- VerifyWebsiteUpdateExamples.Add("application/json", VerifyWebsiteUpdateBody)

  let getVerifyWebsiteUpdateExample mediaType =
    VerifyWebsiteUpdateExamples.[mediaType]
      |> getConverter mediaType
  ()

