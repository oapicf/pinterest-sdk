-module(openapi_conversion_events_data_inner_custom_data).

-export([encode/1]).

-export_type([openapi_conversion_events_data_inner_custom_data/0]).

-type openapi_conversion_events_data_inner_custom_data() ::
    #{ 'content_brand' => binary(),
       'content_category' => binary(),
       'content_ids' => list(),
       'content_name' => binary(),
       'contents' => list(),
       'currency' => binary(),
       'external_measurement_id' => binary(),
       'external_measurement_vendor_id' => integer(),
       'np' => binary(),
       'num_items' => integer(),
       'opt_out_type' => binary(),
       'order_id' => binary(),
       'predicted_ltv' => binary(),
       'search_string' => binary(),
       'value' => binary()
     }.

encode(#{ 'content_brand' := ContentBrand,
          'content_category' := ContentCategory,
          'content_ids' := ContentIds,
          'content_name' := ContentName,
          'contents' := Contents,
          'currency' := Currency,
          'external_measurement_id' := ExternalMeasurementId,
          'external_measurement_vendor_id' := ExternalMeasurementVendorId,
          'np' := Np,
          'num_items' := NumItems,
          'opt_out_type' := OptOutType,
          'order_id' := OrderId,
          'predicted_ltv' := PredictedLtv,
          'search_string' := SearchString,
          'value' := Value
        }) ->
    #{ 'content_brand' => ContentBrand,
       'content_category' => ContentCategory,
       'content_ids' => ContentIds,
       'content_name' => ContentName,
       'contents' => Contents,
       'currency' => Currency,
       'external_measurement_id' => ExternalMeasurementId,
       'external_measurement_vendor_id' => ExternalMeasurementVendorId,
       'np' => Np,
       'num_items' => NumItems,
       'opt_out_type' => OptOutType,
       'order_id' => OrderId,
       'predicted_ltv' => PredictedLtv,
       'search_string' => SearchString,
       'value' => Value
     }.
