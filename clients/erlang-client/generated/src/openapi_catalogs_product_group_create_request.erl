-module(openapi_catalogs_product_group_create_request).

-export([encode/1]).

-export_type([openapi_catalogs_product_group_create_request/0]).

-type openapi_catalogs_product_group_create_request() ::
    #{ 'name' := binary(),
       'description' => binary(),
       'is_featured' => boolean(),
       'filters' := openapi_catalogs_product_group_filters_request:openapi_catalogs_product_group_filters_request(),
       'feed_id' := binary()
     }.

encode(#{ 'name' := Name,
          'description' := Description,
          'is_featured' := IsFeatured,
          'filters' := Filters,
          'feed_id' := FeedId
        }) ->
    #{ 'name' => Name,
       'description' => Description,
       'is_featured' => IsFeatured,
       'filters' => Filters,
       'feed_id' => FeedId
     }.
