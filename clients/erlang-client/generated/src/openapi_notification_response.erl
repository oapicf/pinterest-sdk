-module(openapi_notification_response).

-export([encode/1]).

-export_type([openapi_notification_response/0]).

-type openapi_notification_response() ::
    #{ 'success' => boolean(),
       'received_at' => integer(),
       'error_msg' => binary()
     }.

encode(#{ 'success' := Success,
          'received_at' := ReceivedAt,
          'error_msg' := ErrorMsg
        }) ->
    #{ 'success' => Success,
       'received_at' => ReceivedAt,
       'error_msg' => ErrorMsg
     }.
