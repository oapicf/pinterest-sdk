-module(openapi_catalogs_product_group_create_request).

-export([encode/1]).

-export_type([openapi_catalogs_product_group_create_request/0]).

-type openapi_catalogs_product_group_create_request() ::
    #{ 'description' => binary(),
       'feed_id' := binary(),
       'filters' := openapi_catalogs_product_group_filters_request:openapi_catalogs_product_group_filters_request(),
       'is_featured' => boolean(),
       'name' := binary()
     }.

encode(#{ 'description' := Description,
          'feed_id' := FeedId,
          'filters' := Filters,
          'is_featured' := IsFeatured,
          'name' := Name
        }) ->
    #{ 'description' => Description,
       'feed_id' => FeedId,
       'filters' => Filters,
       'is_featured' => IsFeatured,
       'name' => Name
     }.
