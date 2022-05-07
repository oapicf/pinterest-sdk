-module(openapi_catalogs_product_group_create_request).

-export([encode/1]).

-export_type([openapi_catalogs_product_group_create_request/0]).

-type openapi_catalogs_product_group_create_request() ::
    #{ 'feed_id' := binary(),
       'name' := binary(),
       'description' => binary(),
       'filters' := openapi_catalogs_product_group_filters:openapi_catalogs_product_group_filters()
     }.

encode(#{ 'feed_id' := FeedId,
          'name' := Name,
          'description' := Description,
          'filters' := Filters
        }) ->
    #{ 'feed_id' => FeedId,
       'name' => Name,
       'description' => Description,
       'filters' => Filters
     }.
