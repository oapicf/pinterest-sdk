-module(openapi_catalogs_hotel_feeds_update_request).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_feeds_update_request/0]).

-type openapi_catalogs_hotel_feeds_update_request() ::
    #{ 'default_currency' => openapi_nullable_currency:openapi_nullable_currency(),
       'name' => binary(),
       'format' => openapi_catalogs_format:openapi_catalogs_format(),
       'credentials' => openapi_catalogs_feed_credentials:openapi_catalogs_feed_credentials(),
       'location' => binary(),
       'preferred_processing_schedule' => openapi_catalogs_feed_processing_schedule:openapi_catalogs_feed_processing_schedule(),
       'status' => openapi_catalogs_status:openapi_catalogs_status(),
       'catalog_type' := openapi_catalogs_type:openapi_catalogs_type()
     }.

encode(#{ 'default_currency' := DefaultCurrency,
          'name' := Name,
          'format' := Format,
          'credentials' := Credentials,
          'location' := Location,
          'preferred_processing_schedule' := PreferredProcessingSchedule,
          'status' := Status,
          'catalog_type' := CatalogType
        }) ->
    #{ 'default_currency' => DefaultCurrency,
       'name' => Name,
       'format' => Format,
       'credentials' => Credentials,
       'location' => Location,
       'preferred_processing_schedule' => PreferredProcessingSchedule,
       'status' => Status,
       'catalog_type' => CatalogType
     }.
