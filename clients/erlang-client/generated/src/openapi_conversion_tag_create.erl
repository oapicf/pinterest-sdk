-module(openapi_conversion_tag_create).

-export([encode/1]).

-export_type([openapi_conversion_tag_create/0]).

-type openapi_conversion_tag_create() ::
    #{ 'aem_db_enabled' => boolean(),
       'aem_enabled' => boolean(),
       'aem_external_id_enabled' => boolean(),
       'aem_fnln_enabled' => boolean(),
       'aem_ge_enabled' => boolean(),
       'aem_loc_enabled' => boolean(),
       'aem_ph_enabled' => boolean(),
       'md_frequency' => integer(),
       'name' := binary()
     }.

encode(#{ 'aem_db_enabled' := AemDbEnabled,
          'aem_enabled' := AemEnabled,
          'aem_external_id_enabled' := AemExternalIdEnabled,
          'aem_fnln_enabled' := AemFnlnEnabled,
          'aem_ge_enabled' := AemGeEnabled,
          'aem_loc_enabled' := AemLocEnabled,
          'aem_ph_enabled' := AemPhEnabled,
          'md_frequency' := MdFrequency,
          'name' := Name
        }) ->
    #{ 'aem_db_enabled' => AemDbEnabled,
       'aem_enabled' => AemEnabled,
       'aem_external_id_enabled' => AemExternalIdEnabled,
       'aem_fnln_enabled' => AemFnlnEnabled,
       'aem_ge_enabled' => AemGeEnabled,
       'aem_loc_enabled' => AemLocEnabled,
       'aem_ph_enabled' => AemPhEnabled,
       'md_frequency' => MdFrequency,
       'name' => Name
     }.
