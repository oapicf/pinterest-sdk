-module(openapi_leads_exports).

-include("openapi.hrl").

-export([openapi_leads_exports/0]).

-export([openapi_leads_exports/1]).

-export_type([openapi_leads_exports/0]).

-type openapi_leads_exports() ::
  [ {'leads_export_id', binary() }
  ].


openapi_leads_exports() ->
    openapi_leads_exports([]).

openapi_leads_exports(Fields) ->
  Default = [ {'leads_export_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

