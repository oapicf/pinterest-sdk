-module(openapi_lead_form_common_policy_links_inner).

-export([encode/1]).

-export_type([openapi_lead_form_common_policy_links_inner/0]).

-type openapi_lead_form_common_policy_links_inner() ::
    #{ 'label' => binary(),
       'link' => binary()
     }.

encode(#{ 'label' := Label,
          'link' := Link
        }) ->
    #{ 'label' => Label,
       'link' => Link
     }.
