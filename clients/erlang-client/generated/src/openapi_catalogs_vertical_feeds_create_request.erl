-module(openapi_catalogs_vertical_feeds_create_request).

-export([encode/1]).

-export_type([openapi_catalogs_vertical_feeds_create_request/0]).

-type openapi_catalogs_vertical_feeds_create_request() ::
    #{ 'default_currency' => openapi_nullable_currency:openapi_nullable_currency(),
       'name' := binary(),
       'format' := openapi_catalogs_format:openapi_catalogs_format(),
       'default_locale' := openapi_catalogs_feeds_create_request_default_locale:openapi_catalogs_feeds_create_request_default_locale(),
       'credentials' => openapi_catalogs_feed_credentials:openapi_catalogs_feed_credentials(),
       'location' := binary(),
       'preferred_processing_schedule' => openapi_catalogs_feed_processing_schedule:openapi_catalogs_feed_processing_schedule(),
       'catalog_type' := openapi_catalogs_type:openapi_catalogs_type(),
       'default_country' := openapi_country:openapi_country(),
       'default_availability' => openapi_product_availability_type:openapi_product_availability_type(),
       'catalog_id' => binary()
     }.

encode(#{ 'default_currency' := DefaultCurrency,
          'name' := Name,
          'format' := Format,
          'default_locale' := DefaultLocale,
          'credentials' := Credentials,
          'location' := Location,
          'preferred_processing_schedule' := PreferredProcessingSchedule,
          'catalog_type' := CatalogType,
          'default_country' := DefaultCountry,
          'default_availability' := DefaultAvailability,
          'catalog_id' := CatalogId
        }) ->
    #{ 'default_currency' => DefaultCurrency,
       'name' => Name,
       'format' => Format,
       'default_locale' => DefaultLocale,
       'credentials' => Credentials,
       'location' => Location,
       'preferred_processing_schedule' => PreferredProcessingSchedule,
       'catalog_type' => CatalogType,
       'default_country' => DefaultCountry,
       'default_availability' => DefaultAvailability,
       'catalog_id' => CatalogId
     }.
