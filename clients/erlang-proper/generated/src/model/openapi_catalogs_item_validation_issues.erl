-module(openapi_catalogs_item_validation_issues).

-include("openapi.hrl").

-export([openapi_catalogs_item_validation_issues/0]).

-export([openapi_catalogs_item_validation_issues/1]).

-export_type([openapi_catalogs_item_validation_issues/0]).

-type openapi_catalogs_item_validation_issues() ::
  [ {'item_number', integer() }
  | {'item_id', binary() }
  | {'errors', openapi_catalogs_item_validation_errors:openapi_catalogs_item_validation_errors() }
  | {'warnings', openapi_catalogs_item_validation_warnings:openapi_catalogs_item_validation_warnings() }
  ].


openapi_catalogs_item_validation_issues() ->
    openapi_catalogs_item_validation_issues([]).

openapi_catalogs_item_validation_issues(Fields) ->
  Default = [ {'item_number', integer() }
            , {'item_id', binary() }
            , {'errors', openapi_catalogs_item_validation_errors:openapi_catalogs_item_validation_errors() }
            , {'warnings', openapi_catalogs_item_validation_warnings:openapi_catalogs_item_validation_warnings() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

