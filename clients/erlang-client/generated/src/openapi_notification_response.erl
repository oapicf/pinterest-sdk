-module(openapi_notification_response).

-export([encode/1]).

-export_type([openapi_notification_response/0]).

-type openapi_notification_response() ::
    #{ 'error_msg' => binary(),
       'received_at' => integer(),
       'success' => boolean()
     }.

encode(#{ 'error_msg' := ErrorMsg,
          'received_at' := ReceivedAt,
          'success' := Success
        }) ->
    #{ 'error_msg' => ErrorMsg,
       'received_at' => ReceivedAt,
       'success' => Success
     }.
