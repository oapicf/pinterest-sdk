-module(openapi_conversion_tag_create).

-include("openapi.hrl").

-export([openapi_conversion_tag_create/0]).

-export([openapi_conversion_tag_create/1]).

-export_type([openapi_conversion_tag_create/0]).

-type openapi_conversion_tag_create() ::
  [ {'aem_enabled', boolean() }
  | {'md_frequency', integer() }
  | {'aem_fnln_enabled', boolean() }
  | {'aem_ph_enabled', boolean() }
  | {'aem_ge_enabled', boolean() }
  | {'aem_db_enabled', boolean() }
  | {'aem_loc_enabled', boolean() }
  | {'name', binary() }
  ].


openapi_conversion_tag_create() ->
    openapi_conversion_tag_create([]).

openapi_conversion_tag_create(Fields) ->
  Default = [ {'aem_enabled', boolean() }
            , {'md_frequency', integer() }
            , {'aem_fnln_enabled', boolean() }
            , {'aem_ph_enabled', boolean() }
            , {'aem_ge_enabled', boolean() }
            , {'aem_db_enabled', boolean() }
            , {'aem_loc_enabled', boolean() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

