-module(openapi_delete_partners_response).

-include("openapi.hrl").

-export([openapi_delete_partners_response/0]).

-export([openapi_delete_partners_response/1]).

-export_type([openapi_delete_partners_response/0]).

-type openapi_delete_partners_response() ::
  [ {'deleted_partners', list(binary()) }
  ].


openapi_delete_partners_response() ->
    openapi_delete_partners_response([]).

openapi_delete_partners_response(Fields) ->
  Default = [ {'deleted_partners', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

