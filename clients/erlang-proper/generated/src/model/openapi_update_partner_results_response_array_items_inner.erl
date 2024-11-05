-module(openapi_update_partner_results_response_array_items_inner).

-include("openapi.hrl").

-export([openapi_update_partner_results_response_array_items_inner/0]).

-export([openapi_update_partner_results_response_array_items_inner/1]).

-export_type([openapi_update_partner_results_response_array_items_inner/0]).

-type openapi_update_partner_results_response_array_items_inner() ::
  [ {'exception', openapi_business_access_error:openapi_business_access_error() }
  | {'member_or_partner_id', binary() }
  ].


openapi_update_partner_results_response_array_items_inner() ->
    openapi_update_partner_results_response_array_items_inner([]).

openapi_update_partner_results_response_array_items_inner(Fields) ->
  Default = [ {'exception', openapi_business_access_error:openapi_business_access_error() }
            , {'member_or_partner_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

