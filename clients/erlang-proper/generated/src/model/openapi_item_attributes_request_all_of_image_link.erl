-module(openapi_item_attributes_request_all_of_image_link).

-include("openapi.hrl").

-export([openapi_item_attributes_request_all_of_image_link/0]).

-export([openapi_item_attributes_request_all_of_image_link/1]).

-export_type([openapi_item_attributes_request_all_of_image_link/0]).

-type openapi_item_attributes_request_all_of_image_link() ::
  [ 
  ].


openapi_item_attributes_request_all_of_image_link() ->
    openapi_item_attributes_request_all_of_image_link([]).

openapi_item_attributes_request_all_of_image_link(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

