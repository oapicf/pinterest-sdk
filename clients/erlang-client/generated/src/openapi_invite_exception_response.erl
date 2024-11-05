-module(openapi_invite_exception_response).

-export([encode/1]).

-export_type([openapi_invite_exception_response/0]).

-type openapi_invite_exception_response() ::
    #{ 'invite_or_request_id' => binary(),
       'code' => integer(),
       'message' => binary(),
       'users_or_partner_ids' => list()
     }.

encode(#{ 'invite_or_request_id' := InviteOrRequestId,
          'code' := Code,
          'message' := Message,
          'users_or_partner_ids' := UsersOrPartnerIds
        }) ->
    #{ 'invite_or_request_id' => InviteOrRequestId,
       'code' => Code,
       'message' => Message,
       'users_or_partner_ids' => UsersOrPartnerIds
     }.
