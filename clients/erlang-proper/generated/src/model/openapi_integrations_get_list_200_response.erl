-module(openapi_integrations_get_list_200_response).

-include("openapi.hrl").

-export([openapi_integrations_get_list_200_response/0]).

-export([openapi_integrations_get_list_200_response/1]).

-export_type([openapi_integrations_get_list_200_response/0]).

-type openapi_integrations_get_list_200_response() ::
  [ {'items', list(openapi_integration_record:openapi_integration_record()) }
  | {'bookmark', binary() }
  ].


openapi_integrations_get_list_200_response() ->
    openapi_integrations_get_list_200_response([]).

openapi_integrations_get_list_200_response(Fields) ->
  Default = [ {'items', list(openapi_integration_record:openapi_integration_record()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

