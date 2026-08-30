-module(openapi_catalogs_feed_update_request_schema).

-export([encode/1]).

-export_type([openapi_catalogs_feed_update_request_schema/0]).

-type openapi_catalogs_feed_update_request_schema() ::
    #{ 'catalog_type' := binary(),
       'credentials' => openapi_catalogs_feed_credentials:openapi_catalogs_feed_credentials(),
       'default_availability' => openapi_product_availability_type:openapi_product_availability_type(),
       'default_currency' => openapi_nullable_currency:openapi_nullable_currency(),
       'format' => openapi_catalogs_format:openapi_catalogs_format(),
       'location' => binary(),
       'name' => binary(),
       'preferred_processing_schedule' => openapi_catalogs_feed_processing_schedule:openapi_catalogs_feed_processing_schedule(),
       'status' => openapi_catalogs_status:openapi_catalogs_status()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'credentials' := Credentials,
          'default_availability' := DefaultAvailability,
          'default_currency' := DefaultCurrency,
          'format' := Format,
          'location' := Location,
          'name' := Name,
          'preferred_processing_schedule' := PreferredProcessingSchedule,
          'status' := Status
        }) ->
    #{ 'catalog_type' => CatalogType,
       'credentials' => Credentials,
       'default_availability' => DefaultAvailability,
       'default_currency' => DefaultCurrency,
       'format' => Format,
       'location' => Location,
       'name' => Name,
       'preferred_processing_schedule' => PreferredProcessingSchedule,
       'status' => Status
     }.
