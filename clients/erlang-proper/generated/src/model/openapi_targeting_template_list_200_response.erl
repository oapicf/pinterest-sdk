-module(openapi_targeting_template_list_200_response).

-include("openapi.hrl").

-export([openapi_targeting_template_list_200_response/0]).

-export([openapi_targeting_template_list_200_response/1]).

-export_type([openapi_targeting_template_list_200_response/0]).

-type openapi_targeting_template_list_200_response() ::
  [ {'bookmark', binary() }
  | {'items', list(openapi_targeting_template:openapi_targeting_template()) }
  ].


openapi_targeting_template_list_200_response() ->
    openapi_targeting_template_list_200_response([]).

openapi_targeting_template_list_200_response(Fields) ->
  Default = [ {'bookmark', binary() }
            , {'items', list(openapi_targeting_template:openapi_targeting_template()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

