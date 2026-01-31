-module(openapi_catalogs_retail_feed).

-export([encode/1]).

-export_type([openapi_catalogs_retail_feed/0]).

-type openapi_catalogs_retail_feed() ::
    #{ 'created_at' := openapi_date_time:openapi_date_time(),
       'id' := binary(),
       'updated_at' := openapi_date_time:openapi_date_time(),
       'catalog_type' := openapi_catalogs_type:openapi_catalogs_type(),
       'credentials' := openapi_catalogs_feed_credentials:openapi_catalogs_feed_credentials(),
       'default_availability' := openapi_product_availability_type:openapi_product_availability_type(),
       'default_country' := openapi_country:openapi_country(),
       'default_currency' := openapi_nullable_currency:openapi_nullable_currency(),
       'default_locale' := binary(),
       'format' := openapi_catalogs_format:openapi_catalogs_format(),
       'location' := binary(),
       'name' := binary(),
       'preferred_processing_schedule' := openapi_catalogs_feed_processing_schedule:openapi_catalogs_feed_processing_schedule(),
       'status' := openapi_catalogs_status:openapi_catalogs_status()
     }.

encode(#{ 'created_at' := CreatedAt,
          'id' := Id,
          'updated_at' := UpdatedAt,
          'catalog_type' := CatalogType,
          'credentials' := Credentials,
          'default_availability' := DefaultAvailability,
          'default_country' := DefaultCountry,
          'default_currency' := DefaultCurrency,
          'default_locale' := DefaultLocale,
          'format' := Format,
          'location' := Location,
          'name' := Name,
          'preferred_processing_schedule' := PreferredProcessingSchedule,
          'status' := Status
        }) ->
    #{ 'created_at' => CreatedAt,
       'id' => Id,
       'updated_at' => UpdatedAt,
       'catalog_type' => CatalogType,
       'credentials' => Credentials,
       'default_availability' => DefaultAvailability,
       'default_country' => DefaultCountry,
       'default_currency' => DefaultCurrency,
       'default_locale' => DefaultLocale,
       'format' => Format,
       'location' => Location,
       'name' => Name,
       'preferred_processing_schedule' => PreferredProcessingSchedule,
       'status' => Status
     }.
