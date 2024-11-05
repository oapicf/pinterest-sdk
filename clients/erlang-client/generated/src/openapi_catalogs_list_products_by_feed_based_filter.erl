-module(openapi_catalogs_list_products_by_feed_based_filter).

-export([encode/1]).

-export_type([openapi_catalogs_list_products_by_feed_based_filter/0]).

-type openapi_catalogs_list_products_by_feed_based_filter() ::
    #{ 'feed_id' := binary(),
       'filters' := openapi_catalogs_product_group_filters:openapi_catalogs_product_group_filters()
     }.

encode(#{ 'feed_id' := FeedId,
          'filters' := Filters
        }) ->
    #{ 'feed_id' => FeedId,
       'filters' => Filters
     }.
