-module(openapi_catalogs_creative_assets_feeds_create_request).

-export([encode/1]).

-export_type([openapi_catalogs_creative_assets_feeds_create_request/0]).

-type openapi_catalogs_creative_assets_feeds_create_request() ::
    #{ 'catalog_id' => binary(),
       'catalog_type' := openapi_catalogs_type:openapi_catalogs_type(),
       'credentials' => openapi_catalogs_feed_credentials:openapi_catalogs_feed_credentials(),
       'default_country' := openapi_country:openapi_country(),
       'default_currency' => openapi_nullable_currency:openapi_nullable_currency(),
       'default_locale' := openapi_catalogs_feeds_create_request_default_locale:openapi_catalogs_feeds_create_request_default_locale(),
       'format' := openapi_catalogs_format:openapi_catalogs_format(),
       'location' := binary(),
       'name' := binary(),
       'preferred_processing_schedule' => openapi_catalogs_feed_processing_schedule:openapi_catalogs_feed_processing_schedule(),
       'status' => openapi_catalogs_status:openapi_catalogs_status()
     }.

encode(#{ 'catalog_id' := CatalogId,
          'catalog_type' := CatalogType,
          'credentials' := Credentials,
          'default_country' := DefaultCountry,
          'default_currency' := DefaultCurrency,
          'default_locale' := DefaultLocale,
          'format' := Format,
          'location' := Location,
          'name' := Name,
          'preferred_processing_schedule' := PreferredProcessingSchedule,
          'status' := Status
        }) ->
    #{ 'catalog_id' => CatalogId,
       'catalog_type' => CatalogType,
       'credentials' => Credentials,
       'default_country' => DefaultCountry,
       'default_currency' => DefaultCurrency,
       'default_locale' => DefaultLocale,
       'format' => Format,
       'location' => Location,
       'name' => Name,
       'preferred_processing_schedule' => PreferredProcessingSchedule,
       'status' => Status
     }.
