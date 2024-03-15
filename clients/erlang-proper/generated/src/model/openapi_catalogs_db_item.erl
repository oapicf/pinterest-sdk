-module(openapi_catalogs_db_item).

-include("openapi.hrl").

-export([openapi_catalogs_db_item/0]).

-export([openapi_catalogs_db_item/1]).

-export_type([openapi_catalogs_db_item/0]).

-type openapi_catalogs_db_item() ::
  [ {'created_at', datetime() }
  | {'id', binary() }
  | {'updated_at', datetime() }
  ].


openapi_catalogs_db_item() ->
    openapi_catalogs_db_item([]).

openapi_catalogs_db_item(Fields) ->
  Default = [ {'created_at', datetime() }
            , {'id', binary() }
            , {'updated_at', datetime() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

