-module(openapi_leads_exports_create).

-include("openapi.hrl").

-export([openapi_leads_exports_create/0]).

-export([openapi_leads_exports_create/1]).

-export_type([openapi_leads_exports_create/0]).

-type openapi_leads_exports_create() ::
  [ {'ad_id', binary() }
  | {'end_date', binary() }
  | {'start_date', binary() }
  ].


openapi_leads_exports_create() ->
    openapi_leads_exports_create([]).

openapi_leads_exports_create(Fields) ->
  Default = [ {'ad_id', binary() }
            , {'end_date', binary() }
            , {'start_date', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

