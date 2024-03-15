-module(openapi_catalogs_product_group_update_request).

-export([encode/1]).

-export_type([openapi_catalogs_product_group_update_request/0]).

-type openapi_catalogs_product_group_update_request() ::
    #{ 'name' => binary(),
       'description' => binary(),
       'is_featured' => boolean(),
       'filters' => openapi_catalogs_product_group_filters_request:openapi_catalogs_product_group_filters_request()
     }.

encode(#{ 'name' := Name,
          'description' := Description,
          'is_featured' := IsFeatured,
          'filters' := Filters
        }) ->
    #{ 'name' => Name,
       'description' => Description,
       'is_featured' => IsFeatured,
       'filters' => Filters
     }.
