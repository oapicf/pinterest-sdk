-module(openapi_conversion_tags_list_200_response).

-include("openapi.hrl").

-export([openapi_conversion_tags_list_200_response/0]).

-export([openapi_conversion_tags_list_200_response/1]).

-export_type([openapi_conversion_tags_list_200_response/0]).

-type openapi_conversion_tags_list_200_response() ::
  [ {'items', list(openapi_conversion_tag:openapi_conversion_tag()) }
  ].


openapi_conversion_tags_list_200_response() ->
    openapi_conversion_tags_list_200_response([]).

openapi_conversion_tags_list_200_response(Fields) ->
  Default = [ {'items', list(openapi_conversion_tag:openapi_conversion_tag()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

