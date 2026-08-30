-module(openapi_lead_subscription_post_params_create).

-include("openapi.hrl").

-export([openapi_lead_subscription_post_params_create/0]).

-export([openapi_lead_subscription_post_params_create/1]).

-export_type([openapi_lead_subscription_post_params_create/0]).

-type openapi_lead_subscription_post_params_create() ::
  [ {'lead_form_id', binary() }
  | {'webhook_url', binary() }
  | {'partner_access_token', binary() }
  | {'partner_metadata', openapi_partner_metadata:openapi_partner_metadata() }
  | {'partner_refresh_token', binary() }
  ].


openapi_lead_subscription_post_params_create() ->
    openapi_lead_subscription_post_params_create([]).

openapi_lead_subscription_post_params_create(Fields) ->
  Default = [ {'lead_form_id', binary() }
            , {'webhook_url', binary() }
            , {'partner_access_token', binary() }
            , {'partner_metadata', openapi_partner_metadata:openapi_partner_metadata() }
            , {'partner_refresh_token', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

