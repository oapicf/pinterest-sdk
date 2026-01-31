-module(openapi_invite_exception_response).

-export([encode/1]).

-export_type([openapi_invite_exception_response/0]).

-type openapi_invite_exception_response() ::
    #{ 'code' => integer(),
       'invite_or_request_id' => binary(),
       'message' => binary(),
       'users_or_partner_ids' => list()
     }.

encode(#{ 'code' := Code,
          'invite_or_request_id' := InviteOrRequestId,
          'message' := Message,
          'users_or_partner_ids' := UsersOrPartnerIds
        }) ->
    #{ 'code' => Code,
       'invite_or_request_id' => InviteOrRequestId,
       'message' => Message,
       'users_or_partner_ids' => UsersOrPartnerIds
     }.
