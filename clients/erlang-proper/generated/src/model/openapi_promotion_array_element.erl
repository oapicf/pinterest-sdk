-module(openapi_promotion_array_element).

-include("openapi.hrl").

-export([openapi_promotion_array_element/0]).

-export([openapi_promotion_array_element/1]).

-export_type([openapi_promotion_array_element/0]).

-type openapi_promotion_array_element() ::
  [ {'data', openapi_promotion_response:openapi_promotion_response() }
  | {'exception', openapi_exception:openapi_exception() }
  ].


openapi_promotion_array_element() ->
    openapi_promotion_array_element([]).

openapi_promotion_array_element(Fields) ->
  Default = [ {'data', openapi_promotion_response:openapi_promotion_response() }
            , {'exception', openapi_exception:openapi_exception() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

