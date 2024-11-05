-module(openapi_update_member_result).

-export([encode/1]).

-export_type([openapi_update_member_result/0]).

-type openapi_update_member_result() ::
    #{ 'business_role' => binary(),
       'member_id' => binary()
     }.

encode(#{ 'business_role' := BusinessRole,
          'member_id' := MemberId
        }) ->
    #{ 'business_role' => BusinessRole,
       'member_id' => MemberId
     }.
