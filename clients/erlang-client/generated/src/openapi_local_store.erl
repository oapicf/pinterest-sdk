-module(openapi_local_store).

-export([encode/1]).

-export_type([openapi_local_store/0]).

-type openapi_local_store() ::
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
       'updated_at' := openapi_date_time:openapi_date_time()
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
          'updated_at' := UpdatedAt
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
       'updated_at' => UpdatedAt
     }.
