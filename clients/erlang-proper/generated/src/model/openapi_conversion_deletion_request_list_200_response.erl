-module(openapi_conversion_deletion_request_list_200_response).

-include("openapi.hrl").

-export([openapi_conversion_deletion_request_list_200_response/0]).

-export([openapi_conversion_deletion_request_list_200_response/1]).

-export_type([openapi_conversion_deletion_request_list_200_response/0]).

-type openapi_conversion_deletion_request_list_200_response() ::
  [ {'bookmark', binary() }
  | {'items', list(openapi_conversion_deletion_request:openapi_conversion_deletion_request()) }
  ].


openapi_conversion_deletion_request_list_200_response() ->
    openapi_conversion_deletion_request_list_200_response([]).

openapi_conversion_deletion_request_list_200_response(Fields) ->
  Default = [ {'bookmark', binary() }
            , {'items', list(openapi_conversion_deletion_request:openapi_conversion_deletion_request()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

