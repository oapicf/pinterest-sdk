-module(openapi_business_membership_member).

-export([encode/1]).

-export_type([openapi_business_membership_member/0]).

-type openapi_business_membership_member() ::
    #{ 'business_role' := openapi_business_role_for_members:openapi_business_role_for_members(),
       'member_id' := binary()
     }.

encode(#{ 'business_role' := BusinessRole,
          'member_id' := MemberId
        }) ->
    #{ 'business_role' => BusinessRole,
       'member_id' => MemberId
     }.
