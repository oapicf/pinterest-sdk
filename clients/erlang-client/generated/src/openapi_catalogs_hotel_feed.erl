-module(openapi_catalogs_hotel_feed).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_feed/0]).

-type openapi_catalogs_hotel_feed() ::
    #{ 'created_at' := openapi_date_time:openapi_date_time(),
       'id' := binary(),
       'updated_at' := openapi_date_time:openapi_date_time(),
       'name' := binary(),
       'format' := openapi_catalogs_format:openapi_catalogs_format(),
       'catalog_type' := openapi_catalogs_type:openapi_catalogs_type(),
       'credentials' := openapi_catalogs_feed_credentials:openapi_catalogs_feed_credentials(),
       'location' := binary(),
       'preferred_processing_schedule' := openapi_catalogs_feed_processing_schedule:openapi_catalogs_feed_processing_schedule(),
       'status' := openapi_catalogs_status:openapi_catalogs_status(),
       'default_currency' := openapi_nullable_currency:openapi_nullable_currency(),
       'default_locale' := binary(),
       'catalog_id' := binary()
     }.

encode(#{ 'created_at' := CreatedAt,
          'id' := Id,
          'updated_at' := UpdatedAt,
          'name' := Name,
          'format' := Format,
          'catalog_type' := CatalogType,
          'credentials' := Credentials,
          'location' := Location,
          'preferred_processing_schedule' := PreferredProcessingSchedule,
          'status' := Status,
          'default_currency' := DefaultCurrency,
          'default_locale' := DefaultLocale,
          'catalog_id' := CatalogId
        }) ->
    #{ 'created_at' => CreatedAt,
       'id' => Id,
       'updated_at' => UpdatedAt,
       'name' => Name,
       'format' => Format,
       'catalog_type' => CatalogType,
       'credentials' => Credentials,
       'location' => Location,
       'preferred_processing_schedule' => PreferredProcessingSchedule,
       'status' => Status,
       'default_currency' => DefaultCurrency,
       'default_locale' => DefaultLocale,
       'catalog_id' => CatalogId
     }.
