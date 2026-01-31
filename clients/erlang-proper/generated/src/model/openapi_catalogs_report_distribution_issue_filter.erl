-module(openapi_catalogs_report_distribution_issue_filter).

-include("openapi.hrl").

-export([openapi_catalogs_report_distribution_issue_filter/0]).

-export([openapi_catalogs_report_distribution_issue_filter/1]).

-export_type([openapi_catalogs_report_distribution_issue_filter/0]).

-type openapi_catalogs_report_distribution_issue_filter() ::
  [ {'catalog_id', binary() }
  | {'report_type', binary() }
  ].


openapi_catalogs_report_distribution_issue_filter() ->
    openapi_catalogs_report_distribution_issue_filter([]).

openapi_catalogs_report_distribution_issue_filter(Fields) ->
  Default = [ {'catalog_id', binary() }
            , {'report_type', elements([<<"DISTRIBUTION_ISSUES">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

