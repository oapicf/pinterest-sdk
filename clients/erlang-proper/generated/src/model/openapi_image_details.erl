-module(openapi_image_details).

-include("openapi.hrl").

-export([openapi_image_details/0]).

-export([openapi_image_details/1]).

-export_type([openapi_image_details/0]).

-type openapi_image_details() ::
  [ {'width', integer() }
  | {'height', integer() }
  | {'url', binary() }
  ].


openapi_image_details() ->
    openapi_image_details([]).

openapi_image_details(Fields) ->
  Default = [ {'width', integer(100) }
            , {'height', integer(100) }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

