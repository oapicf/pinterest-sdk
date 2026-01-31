-module(openapi_members_to_delete_body_members_inner).

-export([encode/1]).

-export_type([openapi_members_to_delete_body_members_inner/0]).

-type openapi_members_to_delete_body_members_inner() ::
    #{ 'business_role' := openapi_business_role_for_members:openapi_business_role_for_members(),
       'member_id' := binary()
     }.

encode(#{ 'business_role' := BusinessRole,
          'member_id' := MemberId
        }) ->
    #{ 'business_role' => BusinessRole,
       'member_id' => MemberId
     }.
