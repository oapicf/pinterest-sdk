-module(openapi_catalogs_hotel_attributes).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_attributes/0]).

-type openapi_catalogs_hotel_attributes() ::
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
       'guest_ratings' => openapi_catalogs_hotel_guest_ratings:openapi_catalogs_hotel_guest_ratings(),
       'main_image' => openapi_catalogs_hotel_attributes_all_of_main_image:openapi_catalogs_hotel_attributes_all_of_main_image(),
       'additional_image_link' => list()
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
          'guest_ratings' := GuestRatings,
          'main_image' := MainImage,
          'additional_image_link' := AdditionalImageLink
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
       'guest_ratings' => GuestRatings,
       'main_image' => MainImage,
       'additional_image_link' => AdditionalImageLink
     }.
