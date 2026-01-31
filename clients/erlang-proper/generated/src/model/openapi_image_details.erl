-module(openapi_image_details).

-include("openapi.hrl").

-export([openapi_image_details/0]).

-export([openapi_image_details/1]).

-export_type([openapi_image_details/0]).

-type openapi_image_details() ::
  [ {'height', integer() }
  | {'url', binary() }
  | {'width', integer() }
  ].


openapi_image_details() ->
    openapi_image_details([]).

openapi_image_details(Fields) ->
  Default = [ {'height', integer() }
            , {'url', binary() }
            , {'width', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

