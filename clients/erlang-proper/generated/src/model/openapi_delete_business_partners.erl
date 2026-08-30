-module(openapi_delete_business_partners).

-include("openapi.hrl").

-export([openapi_delete_business_partners/0]).

-export([openapi_delete_business_partners/1]).

-export_type([openapi_delete_business_partners/0]).

-type openapi_delete_business_partners() ::
  [ {'deleted_partners', list(binary()) }
  ].


openapi_delete_business_partners() ->
    openapi_delete_business_partners([]).

openapi_delete_business_partners(Fields) ->
  Default = [ {'deleted_partners', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

