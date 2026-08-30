-module(openapi_catalogs_feed).

-export([encode/1]).

-export_type([openapi_catalogs_feed/0]).

-type openapi_catalogs_feed() ::
    #{ 'catalog_type' := binary(),
       'created_at' := openapi_date_time:openapi_date_time(),
       'credentials' => openapi_catalogs_feed_credentials:openapi_catalogs_feed_credentials(),
       'default_availability' => openapi_product_availability_type:openapi_product_availability_type(),
       'default_country' := openapi_country:openapi_country(),
       'default_currency' => openapi_nullable_currency:openapi_nullable_currency(),
       'default_locale' := binary(),
       'format' := openapi_catalogs_format:openapi_catalogs_format(),
       'id' := binary(),
       'location' := binary(),
       'name' := binary(),
       'preferred_processing_schedule' => openapi_catalogs_feed_processing_schedule:openapi_catalogs_feed_processing_schedule(),
       'status' := openapi_catalogs_status:openapi_catalogs_status(),
       'updated_at' := openapi_date_time:openapi_date_time(),
       'catalog_id' := binary()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'created_at' := CreatedAt,
          'credentials' := Credentials,
          'default_availability' := DefaultAvailability,
          'default_country' := DefaultCountry,
          'default_currency' := DefaultCurrency,
          'default_locale' := DefaultLocale,
          'format' := Format,
          'id' := Id,
          'location' := Location,
          'name' := Name,
          'preferred_processing_schedule' := PreferredProcessingSchedule,
          'status' := Status,
          'updated_at' := UpdatedAt,
          'catalog_id' := CatalogId
        }) ->
    #{ 'catalog_type' => CatalogType,
       'created_at' => CreatedAt,
       'credentials' => Credentials,
       'default_availability' => DefaultAvailability,
       'default_country' => DefaultCountry,
       'default_currency' => DefaultCurrency,
       'default_locale' => DefaultLocale,
       'format' => Format,
       'id' => Id,
       'location' => Location,
       'name' => Name,
       'preferred_processing_schedule' => PreferredProcessingSchedule,
       'status' => Status,
       'updated_at' => UpdatedAt,
       'catalog_id' => CatalogId
     }.
