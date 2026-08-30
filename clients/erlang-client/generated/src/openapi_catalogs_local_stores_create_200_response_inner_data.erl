-module(openapi_catalogs_local_stores_create_200_response_inner_data).

-export([encode/1]).

-export_type([openapi_catalogs_local_stores_create_200_response_inner_data/0]).

-type openapi_catalogs_local_stores_create_200_response_inner_data() ::
    #{ 'address_primary' => binary(),
       'address_secondary' => binary(),
       'city' => binary(),
       'country' := openapi_country:openapi_country(),
       'created_at' := openapi_date_time:openapi_date_time(),
       'id' := binary(),
       'latitude' => integer(),
       'longitude' => integer(),
       'name' := binary(),
       'postal_code' => binary(),
       'region' => binary(),
       'store_code' := binary(),
       'updated_at' := openapi_date_time:openapi_date_time(),
       'exceptions' := openapi_pinterest_lib_error:openapi_pinterest_lib_error()
     }.

encode(#{ 'address_primary' := AddressPrimary,
          'address_secondary' := AddressSecondary,
          'city' := City,
          'country' := Country,
          'created_at' := CreatedAt,
          'id' := Id,
          'latitude' := Latitude,
          'longitude' := Longitude,
          'name' := Name,
          'postal_code' := PostalCode,
          'region' := Region,
          'store_code' := StoreCode,
          'updated_at' := UpdatedAt,
          'exceptions' := Exceptions
        }) ->
    #{ 'address_primary' => AddressPrimary,
       'address_secondary' => AddressSecondary,
       'city' => City,
       'country' => Country,
       'created_at' => CreatedAt,
       'id' => Id,
       'latitude' => Latitude,
       'longitude' => Longitude,
       'name' => Name,
       'postal_code' => PostalCode,
       'region' => Region,
       'store_code' => StoreCode,
       'updated_at' => UpdatedAt,
       'exceptions' => Exceptions
     }.
