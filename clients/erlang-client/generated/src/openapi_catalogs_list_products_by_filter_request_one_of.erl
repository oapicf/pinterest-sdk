-module(openapi_catalogs_list_products_by_filter_request_one_of).

-export([encode/1]).

-export_type([openapi_catalogs_list_products_by_filter_request_one_of/0]).

-type openapi_catalogs_list_products_by_filter_request_one_of() ::
    #{ 'feed_id' := binary(),
       'filters' := openapi_catalogs_product_group_filters:openapi_catalogs_product_group_filters()
     }.

encode(#{ 'feed_id' := FeedId,
          'filters' := Filters
        }) ->
    #{ 'feed_id' => FeedId,
       'filters' => Filters
     }.
