-module(openapi_conversion_tag_list_response).

-include("openapi.hrl").

-export([openapi_conversion_tag_list_response/0]).

-export([openapi_conversion_tag_list_response/1]).

-export_type([openapi_conversion_tag_list_response/0]).

-type openapi_conversion_tag_list_response() ::
  [ {'items', list(openapi_conversion_tag_response:openapi_conversion_tag_response()) }
  ].


openapi_conversion_tag_list_response() ->
    openapi_conversion_tag_list_response([]).

openapi_conversion_tag_list_response(Fields) ->
  Default = [ {'items', list(openapi_conversion_tag_response:openapi_conversion_tag_response()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

