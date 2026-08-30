-module(openapi_respond_to_invite_result_item).

-export([encode/1]).

-export_type([openapi_respond_to_invite_result_item/0]).

-type openapi_respond_to_invite_result_item() ::
    #{ 'exception' => openapi_invite_exception_response:openapi_invite_exception_response(),
       'invite' => openapi_base_invite_data_response:openapi_base_invite_data_response()
     }.

encode(#{ 'exception' := Exception,
          'invite' := Invite
        }) ->
    #{ 'exception' => Exception,
       'invite' => Invite
     }.
