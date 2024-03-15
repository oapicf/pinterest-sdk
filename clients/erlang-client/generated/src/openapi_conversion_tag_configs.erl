-module(openapi_conversion_tag_configs).

-export([encode/1]).

-export_type([openapi_conversion_tag_configs/0]).

-type openapi_conversion_tag_configs() ::
    #{ 'aem_enabled' => boolean(),
       'md_frequency' => integer(),
       'aem_fnln_enabled' => boolean(),
       'aem_ph_enabled' => boolean(),
       'aem_ge_enabled' => boolean(),
       'aem_db_enabled' => boolean(),
       'aem_loc_enabled' => boolean()
     }.

encode(#{ 'aem_enabled' := AemEnabled,
          'md_frequency' := MdFrequency,
          'aem_fnln_enabled' := AemFnlnEnabled,
          'aem_ph_enabled' := AemPhEnabled,
          'aem_ge_enabled' := AemGeEnabled,
          'aem_db_enabled' := AemDbEnabled,
          'aem_loc_enabled' := AemLocEnabled
        }) ->
    #{ 'aem_enabled' => AemEnabled,
       'md_frequency' => MdFrequency,
       'aem_fnln_enabled' => AemFnlnEnabled,
       'aem_ph_enabled' => AemPhEnabled,
       'aem_ge_enabled' => AemGeEnabled,
       'aem_db_enabled' => AemDbEnabled,
       'aem_loc_enabled' => AemLocEnabled
     }.
