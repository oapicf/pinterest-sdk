-module(openapi_delete_business_partners_delete).

-include("openapi.hrl").

-export([openapi_delete_business_partners_delete/0]).

-export([openapi_delete_business_partners_delete/1]).

-export_type([openapi_delete_business_partners_delete/0]).

-type openapi_delete_business_partners_delete() ::
  [ {'partner_ids', list(binary()) }
  | {'partner_type', openapi_nullable_partner_type:openapi_nullable_partner_type() }
  ].


openapi_delete_business_partners_delete() ->
    openapi_delete_business_partners_delete([]).

openapi_delete_business_partners_delete(Fields) ->
  Default = [ {'partner_ids', list(binary(), 1, 50) }
            , {'partner_type', openapi_nullable_partner_type:openapi_nullable_partner_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

