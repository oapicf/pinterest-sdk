-module(openapi_ssio_account_address).

-export([encode/1]).

-export_type([openapi_ssio_account_address/0]).

-type openapi_ssio_account_address() ::
    #{ 'display' => binary(),
       'purpose' => binary(),
       'address_id' => binary(),
       'order_legal_entity' => binary()
     }.

encode(#{ 'display' := Display,
          'purpose' := Purpose,
          'address_id' := AddressId,
          'order_legal_entity' := OrderLegalEntity
        }) ->
    #{ 'display' => Display,
       'purpose' => Purpose,
       'address_id' => AddressId,
       'order_legal_entity' => OrderLegalEntity
     }.
