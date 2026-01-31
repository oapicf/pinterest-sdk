-module(openapi_lead_subscription).

-include("openapi.hrl").

-export([openapi_lead_subscription/0]).

-export([openapi_lead_subscription/1]).

-export_type([openapi_lead_subscription/0]).

-type openapi_lead_subscription() ::
  [ {'ad_account_id', binary() }
  | {'api_version', binary() }
  | {'created_time', integer() }
  | {'cryptographic_algorithm', binary() }
  | {'cryptographic_key', binary() }
  | {'id', binary() }
  | {'lead_form_id', binary() }
  | {'user_account_id', binary() }
  | {'webhook_url', binary() }
  ].


openapi_lead_subscription() ->
    openapi_lead_subscription([]).

openapi_lead_subscription(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'api_version', binary() }
            , {'created_time', integer() }
            , {'cryptographic_algorithm', binary() }
            , {'cryptographic_key', binary() }
            , {'id', binary() }
            , {'lead_form_id', binary() }
            , {'user_account_id', binary() }
            , {'webhook_url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

