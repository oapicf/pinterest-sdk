-module(openapi_catalogs_hotel_attributes).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_attributes/0]).

-type openapi_catalogs_hotel_attributes() ::
    #{ 'address' => openapi_catalogs_hotel_address:openapi_catalogs_hotel_address(),
       'base_price' => binary(),
       'brand' => binary(),
       'category' => binary(),
       'custom_label_0' => binary(),
       'custom_label_1' => binary(),
       'custom_label_2' => binary(),
       'custom_label_3' => binary(),
       'custom_label_4' => binary(),
       'description' => binary(),
       'guest_ratings' => openapi_catalogs_hotel_guest_ratings:openapi_catalogs_hotel_guest_ratings(),
       'latitude' => integer(),
       'link' => binary(),
       'longitude' => integer(),
       'name' => binary(),
       'neighborhood' => list(),
       'sale_price' => binary(),
       'additional_image_link' => list(),
       'ai_disclosures' => list(),
       'main_image' => openapi_catalogs_hotel_main_image:openapi_catalogs_hotel_main_image()
     }.

encode(#{ 'address' := Address,
          'base_price' := BasePrice,
          'brand' := Brand,
          'category' := Category,
          'custom_label_0' := CustomLabel0,
          'custom_label_1' := CustomLabel1,
          'custom_label_2' := CustomLabel2,
          'custom_label_3' := CustomLabel3,
          'custom_label_4' := CustomLabel4,
          'description' := Description,
          'guest_ratings' := GuestRatings,
          'latitude' := Latitude,
          'link' := Link,
          'longitude' := Longitude,
          'name' := Name,
          'neighborhood' := Neighborhood,
          'sale_price' := SalePrice,
          'additional_image_link' := AdditionalImageLink,
          'ai_disclosures' := AiDisclosures,
          'main_image' := MainImage
        }) ->
    #{ 'address' => Address,
       'base_price' => BasePrice,
       'brand' => Brand,
       'category' => Category,
       'custom_label_0' => CustomLabel0,
       'custom_label_1' => CustomLabel1,
       'custom_label_2' => CustomLabel2,
       'custom_label_3' => CustomLabel3,
       'custom_label_4' => CustomLabel4,
       'description' => Description,
       'guest_ratings' => GuestRatings,
       'latitude' => Latitude,
       'link' => Link,
       'longitude' => Longitude,
       'name' => Name,
       'neighborhood' => Neighborhood,
       'sale_price' => SalePrice,
       'additional_image_link' => AdditionalImageLink,
       'ai_disclosures' => AiDisclosures,
       'main_image' => MainImage
     }.
