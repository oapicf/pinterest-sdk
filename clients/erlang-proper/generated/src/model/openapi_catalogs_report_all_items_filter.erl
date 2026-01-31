-module(openapi_catalogs_report_all_items_filter).

-include("openapi.hrl").

-export([openapi_catalogs_report_all_items_filter/0]).

-export([openapi_catalogs_report_all_items_filter/1]).

-export_type([openapi_catalogs_report_all_items_filter/0]).

-type openapi_catalogs_report_all_items_filter() ::
  [ {'catalog_id', binary() }
  | {'report_type', binary() }
  ].


openapi_catalogs_report_all_items_filter() ->
    openapi_catalogs_report_all_items_filter([]).

openapi_catalogs_report_all_items_filter(Fields) ->
  Default = [ {'catalog_id', binary() }
            , {'report_type', elements([<<"ALL_ITEMS">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

