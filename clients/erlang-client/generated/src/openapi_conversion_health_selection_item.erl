-module(openapi_conversion_health_selection_item).

-export([encode/1]).

-export_type([openapi_conversion_health_selection_item/0]).

-type openapi_conversion_health_selection_item() ::
    #{ 'conversionType' => maps:map(),
       'criteria' => maps:map(),
       'ingestionSource' => maps:map(),
       'status' := openapi_any_type:openapi_any_type()
     }.

encode(#{ 'conversionType' := ConversionType,
          'criteria' := Criteria,
          'ingestionSource' := IngestionSource,
          'status' := Status
        }) ->
    #{ 'conversionType' => ConversionType,
       'criteria' => Criteria,
       'ingestionSource' => IngestionSource,
       'status' => Status
     }.
