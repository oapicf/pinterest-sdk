-module(openapi_catalogs_product_group_update_many_request_items_one_of_items0).

-export([encode/1]).

-export_type([openapi_catalogs_product_group_update_many_request_items_one_of_items0/0]).

-type openapi_catalogs_product_group_update_many_request_items_one_of_items0() ::
    #{ 'description' => binary(),
       'filters' => openapi_catalogs_product_group_filters_request:openapi_catalogs_product_group_filters_request(),
       'is_featured' => boolean(),
       'name' => binary(),
       'id' := binary()
     }.

encode(#{ 'description' := Description,
          'filters' := Filters,
          'is_featured' := IsFeatured,
          'name' := Name,
          'id' := Id
        }) ->
    #{ 'description' => Description,
       'filters' => Filters,
       'is_featured' => IsFeatured,
       'name' => Name,
       'id' => Id
     }.
