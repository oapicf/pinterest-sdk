-module(openapi_invite_data_response).

-export([encode/1]).

-export_type([openapi_invite_data_response/0]).

-type openapi_invite_data_response() ::
    #{ 'invite_expiration' => integer(),
       'invite_status' => binary(),
       'invite_type' => binary(),
       'last_updated_time' => integer(),
       'sent_at' => integer()
     }.

encode(#{ 'invite_expiration' := InviteExpiration,
          'invite_status' := InviteStatus,
          'invite_type' := InviteType,
          'last_updated_time' := LastUpdatedTime,
          'sent_at' := SentAt
        }) ->
    #{ 'invite_expiration' => InviteExpiration,
       'invite_status' => InviteStatus,
       'invite_type' => InviteType,
       'last_updated_time' => LastUpdatedTime,
       'sent_at' => SentAt
     }.
