-module(openapi_lead_subscription_create).

-export([encode/1]).

-export_type([openapi_lead_subscription_create/0]).

-type openapi_lead_subscription_create() ::
    #{ 'lead_form_id' => binary(),
       'webhook_url' := binary()
     }.

encode(#{ 'lead_form_id' := LeadFormId,
          'webhook_url' := WebhookUrl
        }) ->
    #{ 'lead_form_id' => LeadFormId,
       'webhook_url' => WebhookUrl
     }.
