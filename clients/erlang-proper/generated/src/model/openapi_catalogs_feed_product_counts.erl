-module(openapi_catalogs_feed_product_counts).

-include("openapi.hrl").

-export([openapi_catalogs_feed_product_counts/0]).

-export([openapi_catalogs_feed_product_counts/1]).

-export_type([openapi_catalogs_feed_product_counts/0]).

-type openapi_catalogs_feed_product_counts() ::
  [ {'original', integer() }
  | {'ingested', integer() }
  ].


openapi_catalogs_feed_product_counts() ->
    openapi_catalogs_feed_product_counts([]).

openapi_catalogs_feed_product_counts(Fields) ->
  Default = [ {'original', integer() }
            , {'ingested', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

