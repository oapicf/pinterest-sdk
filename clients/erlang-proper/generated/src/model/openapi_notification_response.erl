-module(openapi_notification_response).

-include("openapi.hrl").

-export([openapi_notification_response/0]).

-export([openapi_notification_response/1]).

-export_type([openapi_notification_response/0]).

-type openapi_notification_response() ::
  [ {'error_msg', binary() }
  | {'received_at', integer() }
  | {'success', boolean() }
  ].


openapi_notification_response() ->
    openapi_notification_response([]).

openapi_notification_response(Fields) ->
  Default = [ {'error_msg', binary() }
            , {'received_at', integer() }
            , {'success', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

