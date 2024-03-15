-module(openapi_catalogs_feed_processing_result).

-include("openapi.hrl").

-export([openapi_catalogs_feed_processing_result/0]).

-export([openapi_catalogs_feed_processing_result/1]).

-export_type([openapi_catalogs_feed_processing_result/0]).

-type openapi_catalogs_feed_processing_result() ::
  [ {'created_at', datetime() }
  | {'id', binary() }
  | {'updated_at', datetime() }
  | {'ingestion_details', openapi_catalogs_feed_ingestion_details:openapi_catalogs_feed_ingestion_details() }
  | {'status', openapi_catalogs_feed_processing_status:openapi_catalogs_feed_processing_status() }
  | {'product_counts', openapi_catalogs_feed_product_counts:openapi_catalogs_feed_product_counts() }
  | {'validation_details', openapi_catalogs_feed_validation_details:openapi_catalogs_feed_validation_details() }
  ].


openapi_catalogs_feed_processing_result() ->
    openapi_catalogs_feed_processing_result([]).

openapi_catalogs_feed_processing_result(Fields) ->
  Default = [ {'created_at', datetime() }
            , {'id', binary() }
            , {'updated_at', datetime() }
            , {'ingestion_details', openapi_catalogs_feed_ingestion_details:openapi_catalogs_feed_ingestion_details() }
            , {'status', openapi_catalogs_feed_processing_status:openapi_catalogs_feed_processing_status() }
            , {'product_counts', openapi_catalogs_feed_product_counts:openapi_catalogs_feed_product_counts() }
            , {'validation_details', openapi_catalogs_feed_validation_details:openapi_catalogs_feed_validation_details() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

