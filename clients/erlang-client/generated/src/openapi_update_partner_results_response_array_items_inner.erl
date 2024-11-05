-module(openapi_update_partner_results_response_array_items_inner).

-export([encode/1]).

-export_type([openapi_update_partner_results_response_array_items_inner/0]).

-type openapi_update_partner_results_response_array_items_inner() ::
    #{ 'exception' => openapi_business_access_error:openapi_business_access_error(),
       'member_or_partner_id' => binary()
     }.

encode(#{ 'exception' := Exception,
          'member_or_partner_id' := MemberOrPartnerId
        }) ->
    #{ 'exception' => Exception,
       'member_or_partner_id' => MemberOrPartnerId
     }.
