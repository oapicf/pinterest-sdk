-module(openapi_catalogs_report_distribution_issue_filter).

-include("openapi.hrl").

-export([openapi_catalogs_report_distribution_issue_filter/0]).

-export([openapi_catalogs_report_distribution_issue_filter/1]).

-export_type([openapi_catalogs_report_distribution_issue_filter/0]).

-type openapi_catalogs_report_distribution_issue_filter() ::
  [ {'report_type', binary() }
  | {'catalog_id', binary() }
  ].


openapi_catalogs_report_distribution_issue_filter() ->
    openapi_catalogs_report_distribution_issue_filter([]).

openapi_catalogs_report_distribution_issue_filter(Fields) ->
  Default = [ {'report_type', elements([<<"DISTRIBUTION_ISSUES">>]) }
            , {'catalog_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

