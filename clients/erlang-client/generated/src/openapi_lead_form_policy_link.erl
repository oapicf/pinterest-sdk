-module(openapi_lead_form_policy_link).

-export([encode/1]).

-export_type([openapi_lead_form_policy_link/0]).

-type openapi_lead_form_policy_link() ::
    #{ 'label' => binary(),
       'link' => binary()
     }.

encode(#{ 'label' := Label,
          'link' := Link
        }) ->
    #{ 'label' => Label,
       'link' => Link
     }.
