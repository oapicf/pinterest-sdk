-module(openapi_advertiser_defined_event_input).

-export([encode/1]).

-export_type([openapi_advertiser_defined_event_input/0]).

-type openapi_advertiser_defined_event_input() ::
    #{ 'mapped_conversion_type' := openapi_advertiser_defined_event_mapping_type:openapi_advertiser_defined_event_mapping_type(),
       'name' := binary()
     }.

encode(#{ 'mapped_conversion_type' := MappedConversionType,
          'name' := Name
        }) ->
    #{ 'mapped_conversion_type' => MappedConversionType,
       'name' => Name
     }.
