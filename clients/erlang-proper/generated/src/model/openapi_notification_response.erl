-module(openapi_notification_response).

-include("openapi.hrl").

-export([openapi_notification_response/0]).

-export([openapi_notification_response/1]).

-export_type([openapi_notification_response/0]).

-type openapi_notification_response() ::
  [ {'success', boolean() }
  | {'received_at', integer() }
  | {'error_msg', binary() }
  ].


openapi_notification_response() ->
    openapi_notification_response([]).

openapi_notification_response(Fields) ->
  Default = [ {'success', boolean() }
            , {'received_at', integer() }
            , {'error_msg', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

