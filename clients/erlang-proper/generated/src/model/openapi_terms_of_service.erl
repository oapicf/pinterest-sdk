-module(openapi_terms_of_service).

-include("openapi.hrl").

-export([openapi_terms_of_service/0]).

-export([openapi_terms_of_service/1]).

-export_type([openapi_terms_of_service/0]).

-type openapi_terms_of_service() ::
  [ {'id', binary() }
  | {'html', binary() }
  | {'has_accepted', boolean() }
  | {'ad_account_id', binary() }
  ].


openapi_terms_of_service() ->
    openapi_terms_of_service([]).

openapi_terms_of_service(Fields) ->
  Default = [ {'id', binary() }
            , {'html', binary() }
            , {'has_accepted', boolean() }
            , {'ad_account_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

