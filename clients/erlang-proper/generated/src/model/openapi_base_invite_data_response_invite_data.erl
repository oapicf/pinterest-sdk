-module(openapi_base_invite_data_response_invite_data).

-include("openapi.hrl").

-export([openapi_base_invite_data_response_invite_data/0]).

-export([openapi_base_invite_data_response_invite_data/1]).

-export_type([openapi_base_invite_data_response_invite_data/0]).

-type openapi_base_invite_data_response_invite_data() ::
  [ {'invite_expiration', integer() }
  | {'invite_status', binary() }
  | {'invite_type', binary() }
  | {'last_updated_time', integer() }
  | {'sent_at', integer() }
  ].


openapi_base_invite_data_response_invite_data() ->
    openapi_base_invite_data_response_invite_data([]).

openapi_base_invite_data_response_invite_data(Fields) ->
  Default = [ {'invite_expiration', integer() }
            , {'invite_status', binary() }
            , {'invite_type', binary() }
            , {'last_updated_time', integer() }
            , {'sent_at', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

