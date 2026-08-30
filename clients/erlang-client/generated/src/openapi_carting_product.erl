-module(openapi_carting_product).

-export([encode/1]).

-export_type([openapi_carting_product/0]).

-type openapi_carting_product() ::
    #{ 'carting_product_id' := binary(),
       'display_preferred_retailers_only' => boolean(),
       'display_product_price' => boolean(),
       'preferred_retailers' => list(),
       'randomize_preferred_retailers' => boolean()
     }.

encode(#{ 'carting_product_id' := CartingProductId,
          'display_preferred_retailers_only' := DisplayPreferredRetailersOnly,
          'display_product_price' := DisplayProductPrice,
          'preferred_retailers' := PreferredRetailers,
          'randomize_preferred_retailers' := RandomizePreferredRetailers
        }) ->
    #{ 'carting_product_id' => CartingProductId,
       'display_preferred_retailers_only' => DisplayPreferredRetailersOnly,
       'display_product_price' => DisplayProductPrice,
       'preferred_retailers' => PreferredRetailers,
       'randomize_preferred_retailers' => RandomizePreferredRetailers
     }.
