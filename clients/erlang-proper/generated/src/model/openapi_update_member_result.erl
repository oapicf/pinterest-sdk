-module(openapi_update_member_result).

-include("openapi.hrl").

-export([openapi_update_member_result/0]).

-export([openapi_update_member_result/1]).

-export_type([openapi_update_member_result/0]).

-type openapi_update_member_result() ::
  [ {'business_role', binary() }
  | {'member_id', binary() }
  ].


openapi_update_member_result() ->
    openapi_update_member_result([]).

openapi_update_member_result(Fields) ->
  Default = [ {'business_role', binary() }
            , {'member_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

