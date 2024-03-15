-module(openapi_ssio_account_pmp_name).

-include("openapi.hrl").

-export([openapi_ssio_account_pmp_name/0]).

-export([openapi_ssio_account_pmp_name/1]).

-export_type([openapi_ssio_account_pmp_name/0]).

-type openapi_ssio_account_pmp_name() ::
  [ {'name', binary() }
  | {'id', binary() }
  ].


openapi_ssio_account_pmp_name() ->
    openapi_ssio_account_pmp_name([]).

openapi_ssio_account_pmp_name(Fields) ->
  Default = [ {'name', binary() }
            , {'id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

