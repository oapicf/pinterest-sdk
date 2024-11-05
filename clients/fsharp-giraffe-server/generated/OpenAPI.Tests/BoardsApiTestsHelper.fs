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
  &quot;board_pins_modified_at&quot; : &quot;2020-01-01T20:10:40Z&quot;,
  &quot;name&quot; : &quot;Summer Recipes&quot;,
  &quot;pin_count&quot; : 5,
  &quot;created_at&quot; : &quot;2020-01-01T20:10:40Z&quot;,
  &quot;description&quot; : &quot;My favorite summer recipes&quot;,
  &quot;collaborator_count&quot; : 17,
  &quot;privacy&quot; : &quot;PUBLIC&quot;,
  &quot;id&quot; : &quot;549755885175&quot;,
  &quot;media&quot; : {
    &quot;pin_thumbnail_urls&quot; : [ &quot;https://i.pinimg.com/150x150/b4/57/10/b45710f1ede96af55230f4b43935c4af.jpg&quot;, &quot;https://i.pinimg.com/150x150/dd/ff/46/ddff4616e39c1935cd05738794fa860e.jpg&quot;, &quot;https://i.pinimg.com/150x150/84/ac/59/84ac59b670ccb5b903dace480a98930c.jpg&quot;, &quot;https://i.pinimg.com/150x150/4c/54/6f/4c546f521be85e30838fb742bfff6936.jpg&quot; ],
    &quot;image_cover_url&quot; : &quot;https://i.pinimg.com/400x300/fd/cd/d5/fdcdd5a6d8a80824add0d054125cd957.jpg&quot;
  },
  &quot;follower_count&quot; : 13
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
