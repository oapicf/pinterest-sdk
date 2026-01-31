-module(openapi_feeds_update_request).

-export([encode/1]).

-export_type([openapi_feeds_update_request/0]).

-type openapi_feeds_update_request() ::
    #{ 'catalog_type' := openapi_catalogs_type:openapi_catalogs_type(),
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
