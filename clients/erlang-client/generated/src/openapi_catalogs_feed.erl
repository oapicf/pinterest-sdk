-module(openapi_catalogs_feed).

-export([encode/1]).

-export_type([openapi_catalogs_feed/0]).

-type openapi_catalogs_feed() ::
    #{ 'created_at' => openapi_date_time:openapi_date_time(),
       'id' => binary(),
       'updated_at' => openapi_date_time:openapi_date_time(),
       'default_country' := openapi_country:openapi_country(),
       'default_availability' := openapi_product_availability_type:openapi_product_availability_type(),
       'default_currency' := openapi_nullable_currency:openapi_nullable_currency(),
       'name' := binary(),
       'format' := openapi_catalogs_format:openapi_catalogs_format(),
       'default_locale' := binary(),
       'credentials' := openapi_catalogs_feed_credentials:openapi_catalogs_feed_credentials(),
       'location' := binary(),
       'preferred_processing_schedule' := openapi_catalogs_feed_processing_schedule:openapi_catalogs_feed_processing_schedule(),
       'status' := openapi_catalogs_status:openapi_catalogs_status()
     }.

encode(#{ 'created_at' := CreatedAt,
          'id' := Id,
          'updated_at' := UpdatedAt,
          'default_country' := DefaultCountry,
          'default_availability' := DefaultAvailability,
          'default_currency' := DefaultCurrency,
          'name' := Name,
          'format' := Format,
          'default_locale' := DefaultLocale,
          'credentials' := Credentials,
          'location' := Location,
          'preferred_processing_schedule' := PreferredProcessingSchedule,
          'status' := Status
        }) ->
    #{ 'created_at' => CreatedAt,
       'id' => Id,
       'updated_at' => UpdatedAt,
       'default_country' => DefaultCountry,
       'default_availability' => DefaultAvailability,
       'default_currency' => DefaultCurrency,
       'name' => Name,
       'format' => Format,
       'default_locale' => DefaultLocale,
       'credentials' => Credentials,
       'location' => Location,
       'preferred_processing_schedule' => PreferredProcessingSchedule,
       'status' => Status
     }.
