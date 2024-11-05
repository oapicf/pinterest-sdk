-module(openapi_base_invite_data_response_invite_data).

-export([encode/1]).

-export_type([openapi_base_invite_data_response_invite_data/0]).

-type openapi_base_invite_data_response_invite_data() ::
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
