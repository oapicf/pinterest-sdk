-module(openapi_delete_member_access_result).

-include("openapi.hrl").

-export([openapi_delete_member_access_result/0]).

-export([openapi_delete_member_access_result/1]).

-export_type([openapi_delete_member_access_result/0]).

-type openapi_delete_member_access_result() ::
  [ {'asset_id', binary() }
  | {'member_id', binary() }
  ].


openapi_delete_member_access_result() ->
    openapi_delete_member_access_result([]).

openapi_delete_member_access_result(Fields) ->
  Default = [ {'asset_id', binary() }
            , {'member_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

