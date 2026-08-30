-module(openapi_bid_options_age_bucket_multipliers).

-include("openapi.hrl").

-export([openapi_bid_options_age_bucket_multipliers/0]).

-export([openapi_bid_options_age_bucket_multipliers/1]).

-export_type([openapi_bid_options_age_bucket_multipliers/0]).

-type openapi_bid_options_age_bucket_multipliers() ::
  [ {'18_24', integer() }
  | {'25_34', integer() }
  | {'35_44', integer() }
  | {'45_49', integer() }
  | {'50_54', integer() }
  | {'55_64', integer() }
  | {'65', integer() }
  ].


openapi_bid_options_age_bucket_multipliers() ->
    openapi_bid_options_age_bucket_multipliers([]).

openapi_bid_options_age_bucket_multipliers(Fields) ->
  Default = [ {'18-24', integer() }
            , {'25-34', integer() }
            , {'35-44', integer() }
            , {'45-49', integer() }
            , {'50-54', integer() }
            , {'55-64', integer() }
            , {'65+', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

