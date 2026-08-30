-module(openapi_advertiser_defined_event).

-export([encode/1]).

-export_type([openapi_advertiser_defined_event/0]).

-type openapi_advertiser_defined_event() ::
    #{ 'mapped_conversion_type' => openapi_conversion_tag_type_optimal:openapi_conversion_tag_type_optimal(),
       'name' => binary()
     }.

encode(#{ 'mapped_conversion_type' := MappedConversionType,
          'name' := Name
        }) ->
    #{ 'mapped_conversion_type' => MappedConversionType,
       'name' => Name
     }.
