-module(openapi_feed_processing_results_list_200_response).

-include("openapi.hrl").

-export([openapi_feed_processing_results_list_200_response/0]).

-export([openapi_feed_processing_results_list_200_response/1]).

-export_type([openapi_feed_processing_results_list_200_response/0]).

-type openapi_feed_processing_results_list_200_response() ::
  [ {'items', list(openapi_catalogs_feed_processing_result:openapi_catalogs_feed_processing_result()) }
  | {'bookmark', binary() }
  ].


openapi_feed_processing_results_list_200_response() ->
    openapi_feed_processing_results_list_200_response([]).

openapi_feed_processing_results_list_200_response(Fields) ->
  Default = [ {'items', list(openapi_catalogs_feed_processing_result:openapi_catalogs_feed_processing_result()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

