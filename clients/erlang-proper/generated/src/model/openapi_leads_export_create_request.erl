-module(openapi_leads_export_create_request).

-include("openapi.hrl").

-export([openapi_leads_export_create_request/0]).

-export([openapi_leads_export_create_request/1]).

-export_type([openapi_leads_export_create_request/0]).

-type openapi_leads_export_create_request() ::
  [ {'start_date', binary() }
  | {'end_date', binary() }
  | {'ad_id', binary() }
  ].


openapi_leads_export_create_request() ->
    openapi_leads_export_create_request([]).

openapi_leads_export_create_request(Fields) ->
  Default = [ {'start_date', binary() }
            , {'end_date', binary() }
            , {'ad_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

