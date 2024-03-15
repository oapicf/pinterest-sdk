-module(openapi_catalogs_updatable_hotel_attributes).

-export([encode/1]).

-export_type([openapi_catalogs_updatable_hotel_attributes/0]).

-type openapi_catalogs_updatable_hotel_attributes() ::
    #{ 'name' => binary(),
       'link' => binary(),
       'description' => binary(),
       'brand' => binary(),
       'latitude' => integer(),
       'longitude' => integer(),
       'neighborhood' => list(),
       'address' => openapi_catalogs_hotel_address:openapi_catalogs_hotel_address(),
       'custom_label_0' => binary(),
       'custom_label_1' => binary(),
       'custom_label_2' => binary(),
       'custom_label_3' => binary(),
       'custom_label_4' => binary(),
       'category' => binary(),
       'base_price' => binary(),
       'sale_price' => binary(),
       'guest_ratings' => openapi_catalogs_hotel_guest_ratings:openapi_catalogs_hotel_guest_ratings()
     }.

encode(#{ 'name' := Name,
          'link' := Link,
          'description' := Description,
          'brand' := Brand,
          'latitude' := Latitude,
          'longitude' := Longitude,
          'neighborhood' := Neighborhood,
          'address' := Address,
          'custom_label_0' := CustomLabel0,
          'custom_label_1' := CustomLabel1,
          'custom_label_2' := CustomLabel2,
          'custom_label_3' := CustomLabel3,
          'custom_label_4' := CustomLabel4,
          'category' := Category,
          'base_price' := BasePrice,
          'sale_price' := SalePrice,
          'guest_ratings' := GuestRatings
        }) ->
    #{ 'name' => Name,
       'link' => Link,
       'description' => Description,
       'brand' => Brand,
       'latitude' => Latitude,
       'longitude' => Longitude,
       'neighborhood' => Neighborhood,
       'address' => Address,
       'custom_label_0' => CustomLabel0,
       'custom_label_1' => CustomLabel1,
       'custom_label_2' => CustomLabel2,
       'custom_label_3' => CustomLabel3,
       'custom_label_4' => CustomLabel4,
       'category' => Category,
       'base_price' => BasePrice,
       'sale_price' => SalePrice,
       'guest_ratings' => GuestRatings
     }.
