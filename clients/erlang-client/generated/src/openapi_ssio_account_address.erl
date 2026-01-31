-module(openapi_ssio_account_address).

-export([encode/1]).

-export_type([openapi_ssio_account_address/0]).

-type openapi_ssio_account_address() ::
    #{ 'address_id' => binary(),
       'display' => binary(),
       'order_legal_entity' => binary(),
       'purpose' => binary()
     }.

encode(#{ 'address_id' := AddressId,
          'display' := Display,
          'order_legal_entity' := OrderLegalEntity,
          'purpose' := Purpose
        }) ->
    #{ 'address_id' => AddressId,
       'display' => Display,
       'order_legal_entity' => OrderLegalEntity,
       'purpose' => Purpose
     }.
