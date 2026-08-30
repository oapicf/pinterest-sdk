-module(openapi_invite_data_response).

-include("openapi.hrl").

-export([openapi_invite_data_response/0]).

-export([openapi_invite_data_response/1]).

-export_type([openapi_invite_data_response/0]).

-type openapi_invite_data_response() ::
  [ {'invite_expiration', integer() }
  | {'invite_status', binary() }
  | {'invite_type', binary() }
  | {'last_updated_time', integer() }
  | {'sent_at', integer() }
  ].


openapi_invite_data_response() ->
    openapi_invite_data_response([]).

openapi_invite_data_response(Fields) ->
  Default = [ {'invite_expiration', integer() }
            , {'invite_status', binary() }
            , {'invite_type', binary() }
            , {'last_updated_time', integer() }
            , {'sent_at', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

