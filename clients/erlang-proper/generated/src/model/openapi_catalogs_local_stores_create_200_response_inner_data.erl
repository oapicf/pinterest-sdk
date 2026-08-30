-module(openapi_catalogs_local_stores_create_200_response_inner_data).

-include("openapi.hrl").

-export([openapi_catalogs_local_stores_create_200_response_inner_data/0]).

-export([openapi_catalogs_local_stores_create_200_response_inner_data/1]).

-export_type([openapi_catalogs_local_stores_create_200_response_inner_data/0]).

-type openapi_catalogs_local_stores_create_200_response_inner_data() ::
  [ {'address_primary', binary() }
  | {'address_secondary', binary() }
  | {'city', binary() }
  | {'country', openapi_country:openapi_country() }
  | {'created_at', datetime() }
  | {'id', binary() }
  | {'latitude', integer() }
  | {'longitude', integer() }
  | {'name', binary() }
  | {'postal_code', binary() }
  | {'region', binary() }
  | {'store_code', binary() }
  | {'updated_at', datetime() }
  | {'exceptions', openapi_pinterest_lib_error:openapi_pinterest_lib_error() }
  ].


openapi_catalogs_local_stores_create_200_response_inner_data() ->
    openapi_catalogs_local_stores_create_200_response_inner_data([]).

openapi_catalogs_local_stores_create_200_response_inner_data(Fields) ->
  Default = [ {'address_primary', binary() }
            , {'address_secondary', binary() }
            , {'city', binary() }
            , {'country', openapi_country:openapi_country() }
            , {'created_at', datetime() }
            , {'id', binary() }
            , {'latitude', integer() }
            , {'longitude', integer() }
            , {'name', binary() }
            , {'postal_code', binary() }
            , {'region', binary() }
            , {'store_code', binary() }
            , {'updated_at', datetime() }
            , {'exceptions', openapi_pinterest_lib_error:openapi_pinterest_lib_error() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

