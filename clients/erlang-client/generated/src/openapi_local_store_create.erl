-module(openapi_local_store_create).

-export([encode/1]).

-export_type([openapi_local_store_create/0]).

-type openapi_local_store_create() ::
    #{ 'address_primary' => binary(),
       'address_secondary' => binary(),
       'city' => binary(),
       'country' := openapi_country:openapi_country(),
       'latitude' => integer(),
       'longitude' => integer(),
       'name' := binary(),
       'postal_code' => binary(),
       'region' => binary(),
       'store_code' := binary()
     }.

encode(#{ 'address_primary' := AddressPrimary,
          'address_secondary' := AddressSecondary,
          'city' := City,
          'country' := Country,
          'latitude' := Latitude,
          'longitude' := Longitude,
          'name' := Name,
          'postal_code' := PostalCode,
          'region' := Region,
          'store_code' := StoreCode
        }) ->
    #{ 'address_primary' => AddressPrimary,
       'address_secondary' => AddressSecondary,
       'city' => City,
       'country' => Country,
       'latitude' => Latitude,
       'longitude' => Longitude,
       'name' => Name,
       'postal_code' => PostalCode,
       'region' => Region,
       'store_code' => StoreCode
     }.
