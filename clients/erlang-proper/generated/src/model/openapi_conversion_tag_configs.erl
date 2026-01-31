-module(openapi_conversion_tag_configs).

-include("openapi.hrl").

-export([openapi_conversion_tag_configs/0]).

-export([openapi_conversion_tag_configs/1]).

-export_type([openapi_conversion_tag_configs/0]).

-type openapi_conversion_tag_configs() ::
  [ {'aem_db_enabled', boolean() }
  | {'aem_enabled', boolean() }
  | {'aem_external_id_enabled', boolean() }
  | {'aem_fnln_enabled', boolean() }
  | {'aem_ge_enabled', boolean() }
  | {'aem_loc_enabled', boolean() }
  | {'aem_ph_enabled', boolean() }
  | {'md_frequency', integer() }
  | {'no_code_capi_domains', list(binary()) }
  ].


openapi_conversion_tag_configs() ->
    openapi_conversion_tag_configs([]).

openapi_conversion_tag_configs(Fields) ->
  Default = [ {'aem_db_enabled', boolean() }
            , {'aem_enabled', boolean() }
            , {'aem_external_id_enabled', boolean() }
            , {'aem_fnln_enabled', boolean() }
            , {'aem_ge_enabled', boolean() }
            , {'aem_loc_enabled', boolean() }
            , {'aem_ph_enabled', boolean() }
            , {'md_frequency', integer() }
            , {'no_code_capi_domains', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

