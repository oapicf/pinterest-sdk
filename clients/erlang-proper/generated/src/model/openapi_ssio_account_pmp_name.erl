-module(openapi_ssio_account_pmp_name).

-include("openapi.hrl").

-export([openapi_ssio_account_pmp_name/0]).

-export([openapi_ssio_account_pmp_name/1]).

-export_type([openapi_ssio_account_pmp_name/0]).

-type openapi_ssio_account_pmp_name() ::
  [ {'id', binary() }
  | {'name', binary() }
  ].


openapi_ssio_account_pmp_name() ->
    openapi_ssio_account_pmp_name([]).

openapi_ssio_account_pmp_name(Fields) ->
  Default = [ {'id', binary() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

