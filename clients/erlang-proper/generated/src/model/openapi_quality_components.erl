-module(openapi_quality_components).

-include("openapi.hrl").

-export([openapi_quality_components/0]).

-export([openapi_quality_components/1]).

-export_type([openapi_quality_components/0]).

-type openapi_quality_components() ::
  [ {'advertiser_external_id', map() }
  | {'click_id_epik', map() }
  | {'external_event_id', map() }
  | {'hashed_email', map() }
  | {'hashed_maid', map() }
  | {'ip_address', map() }
  | {'order_id', map() }
  | {'order_value', map() }
  | {'product_id', map() }
  | {'source_url', map() }
  | {'user_agent', map() }
  ].


openapi_quality_components() ->
    openapi_quality_components([]).

openapi_quality_components(Fields) ->
  Default = [ {'advertiser_external_id', map() }
            , {'click_id_epik', map() }
            , {'external_event_id', map() }
            , {'hashed_email', map() }
            , {'hashed_maid', map() }
            , {'ip_address', map() }
            , {'order_id', map() }
            , {'order_value', map() }
            , {'product_id', map() }
            , {'source_url', map() }
            , {'user_agent', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

