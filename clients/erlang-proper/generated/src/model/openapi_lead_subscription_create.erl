-module(openapi_lead_subscription_create).

-include("openapi.hrl").

-export([openapi_lead_subscription_create/0]).

-export([openapi_lead_subscription_create/1]).

-export_type([openapi_lead_subscription_create/0]).

-type openapi_lead_subscription_create() ::
  [ {'lead_form_id', binary() }
  | {'webhook_url', binary() }
  ].


openapi_lead_subscription_create() ->
    openapi_lead_subscription_create([]).

openapi_lead_subscription_create(Fields) ->
  Default = [ {'lead_form_id', binary() }
            , {'webhook_url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

