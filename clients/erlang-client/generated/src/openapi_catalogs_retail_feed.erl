-module(openapi_catalogs_retail_feed).

-export([encode/1]).

-export_type([openapi_catalogs_retail_feed/0]).

-type openapi_catalogs_retail_feed() ::
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
       'updated_at' := openapi_date_time:openapi_date_time()
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
          'updated_at' := UpdatedAt
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
       'updated_at' => UpdatedAt
     }.
