-module(openapi_invite_exception_response).

-include("openapi.hrl").

-export([openapi_invite_exception_response/0]).

-export([openapi_invite_exception_response/1]).

-export_type([openapi_invite_exception_response/0]).

-type openapi_invite_exception_response() ::
  [ {'invite_or_request_id', binary() }
  | {'code', integer() }
  | {'message', binary() }
  | {'users_or_partner_ids', list(binary()) }
  ].


openapi_invite_exception_response() ->
    openapi_invite_exception_response([]).

openapi_invite_exception_response(Fields) ->
  Default = [ {'invite_or_request_id', binary() }
            , {'code', integer() }
            , {'message', binary() }
            , {'users_or_partner_ids', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

