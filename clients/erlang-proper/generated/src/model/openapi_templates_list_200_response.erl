-module(openapi_templates_list_200_response).

-include("openapi.hrl").

-export([openapi_templates_list_200_response/0]).

-export([openapi_templates_list_200_response/1]).

-export_type([openapi_templates_list_200_response/0]).

-type openapi_templates_list_200_response() ::
  [ {'bookmark', binary() }
  | {'items', list(openapi_account_template:openapi_account_template()) }
  ].


openapi_templates_list_200_response() ->
    openapi_templates_list_200_response([]).

openapi_templates_list_200_response(Fields) ->
  Default = [ {'bookmark', binary() }
            , {'items', list(openapi_account_template:openapi_account_template()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

