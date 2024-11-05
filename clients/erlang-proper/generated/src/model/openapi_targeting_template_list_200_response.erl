-module(openapi_targeting_template_list_200_response).

-include("openapi.hrl").

-export([openapi_targeting_template_list_200_response/0]).

-export([openapi_targeting_template_list_200_response/1]).

-export_type([openapi_targeting_template_list_200_response/0]).

-type openapi_targeting_template_list_200_response() ::
  [ {'items', list(openapi_targeting_template_response_data:openapi_targeting_template_response_data()) }
  | {'bookmark', binary() }
  ].


openapi_targeting_template_list_200_response() ->
    openapi_targeting_template_list_200_response([]).

openapi_targeting_template_list_200_response(Fields) ->
  Default = [ {'items', list(openapi_targeting_template_response_data:openapi_targeting_template_response_data()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

