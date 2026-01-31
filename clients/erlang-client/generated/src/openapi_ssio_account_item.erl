-module(openapi_ssio_account_item).

-export([encode/1]).

-export_type([openapi_ssio_account_item/0]).

-type openapi_ssio_account_item() ::
    #{ 'addresses' => list(),
       'id' => binary(),
       'io_terms' => binary(),
       'io_terms_id' => binary(),
       'io_type' => binary(),
       'row_terms' => binary(),
       'row_terms_id' => binary(),
       'us_terms' => binary(),
       'us_terms_id' => binary()
     }.

encode(#{ 'addresses' := Addresses,
          'id' := Id,
          'io_terms' := IoTerms,
          'io_terms_id' := IoTermsId,
          'io_type' := IoType,
          'row_terms' := RowTerms,
          'row_terms_id' := RowTermsId,
          'us_terms' := UsTerms,
          'us_terms_id' := UsTermsId
        }) ->
    #{ 'addresses' => Addresses,
       'id' => Id,
       'io_terms' => IoTerms,
       'io_terms_id' => IoTermsId,
       'io_type' => IoType,
       'row_terms' => RowTerms,
       'row_terms_id' => RowTermsId,
       'us_terms' => UsTerms,
       'us_terms_id' => UsTermsId
     }.
