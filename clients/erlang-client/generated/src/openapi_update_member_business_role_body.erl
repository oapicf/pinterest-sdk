-module(openapi_update_member_business_role_body).

-export([encode/1]).

-export_type([openapi_update_member_business_role_body/0]).

-type openapi_update_member_business_role_body() ::
    #{ 'business_role' := openapi_business_role_for_members:openapi_business_role_for_members(),
       'member_id' := binary()
     }.

encode(#{ 'business_role' := BusinessRole,
          'member_id' := MemberId
        }) ->
    #{ 'business_role' => BusinessRole,
       'member_id' => MemberId
     }.
