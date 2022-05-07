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
open OpenAPI.BoardsApiHandler
open OpenAPI.BoardsApiHandlerParams

module BoardsApiHandlerTestsHelper =


  let mutable BoardSectionsCreateExamples = Map.empty
  let mutable BoardSectionsCreateBody = ""

  BoardSectionsCreateBody <- WebUtility.HtmlDecode "{
  &quot;name&quot; : &quot;Salads&quot;,
  &quot;id&quot; : &quot;549755885175&quot;
}"
  BoardSectionsCreateExamples <- BoardSectionsCreateExamples.Add("application/json", BoardSectionsCreateBody)

  let getBoardSectionsCreateExample mediaType =
    BoardSectionsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()


  let mutable BoardSectionsUpdateExamples = Map.empty
  let mutable BoardSectionsUpdateBody = ""

  BoardSectionsUpdateBody <- WebUtility.HtmlDecode "{
  &quot;name&quot; : &quot;Salads&quot;,
  &quot;id&quot; : &quot;549755885175&quot;
}"
  BoardSectionsUpdateExamples <- BoardSectionsUpdateExamples.Add("application/json", BoardSectionsUpdateBody)

  let getBoardSectionsUpdateExample mediaType =
    BoardSectionsUpdateExamples.[mediaType]
      |> getConverter mediaType

  let mutable BoardsCreateExamples = Map.empty
  let mutable BoardsCreateBody = ""

  BoardsCreateBody <- WebUtility.HtmlDecode "{
  &quot;owner&quot; : &quot;{}&quot;,
  &quot;name&quot; : &quot;Summer Recipes&quot;,
  &quot;description&quot; : &quot;My favorite summer recipes&quot;,
  &quot;privacy&quot; : &quot;PUBLIC&quot;,
  &quot;id&quot; : &quot;549755885175&quot;
}"
  BoardsCreateExamples <- BoardsCreateExamples.Add("application/json", BoardsCreateBody)

  let getBoardsCreateExample mediaType =
    BoardsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()

  ()


  let mutable BoardsUpdateExamples = Map.empty
  let mutable BoardsUpdateBody = ""

  BoardsUpdateBody <- WebUtility.HtmlDecode "{
  &quot;name&quot; : &quot;Summer Recipes&quot;,
  &quot;description&quot; : &quot;My favorite summer recipes&quot;,
  &quot;privacy&quot; : &quot;PUBLIC&quot;
}"
  BoardsUpdateExamples <- BoardsUpdateExamples.Add("application/json", BoardsUpdateBody)

  let getBoardsUpdateExample mediaType =
    BoardsUpdateExamples.[mediaType]
      |> getConverter mediaType
