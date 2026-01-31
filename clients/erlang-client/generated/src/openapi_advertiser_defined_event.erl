-module(openapi_advertiser_defined_event).

-export([encode/1]).

-export_type([openapi_advertiser_defined_event/0]).

-type openapi_advertiser_defined_event() ::
    #{ 'name' => binary(),
       'mapped_conversion_type' => binary()
     }.

encode(#{ 'name' := Name,
          'mapped_conversion_type' := MappedConversionType
        }) ->
    #{ 'name' => Name,
       'mapped_conversion_type' => MappedConversionType
     }.
