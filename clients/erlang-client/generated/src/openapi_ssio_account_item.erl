-module(openapi_ssio_account_item).

-export([encode/1]).

-export_type([openapi_ssio_account_item/0]).

-type openapi_ssio_account_item() ::
    #{ 'id' => binary(),
       'io_terms_id' => binary(),
       'io_terms' => binary(),
       'us_terms_id' => binary(),
       'us_terms' => binary(),
       'row_terms_id' => binary(),
       'row_terms' => binary(),
       'io_type' => binary(),
       'addresses' => list()
     }.

encode(#{ 'id' := Id,
          'io_terms_id' := IoTermsId,
          'io_terms' := IoTerms,
          'us_terms_id' := UsTermsId,
          'us_terms' := UsTerms,
          'row_terms_id' := RowTermsId,
          'row_terms' := RowTerms,
          'io_type' := IoType,
          'addresses' := Addresses
        }) ->
    #{ 'id' => Id,
       'io_terms_id' => IoTermsId,
       'io_terms' => IoTerms,
       'us_terms_id' => UsTermsId,
       'us_terms' => UsTerms,
       'row_terms_id' => RowTermsId,
       'row_terms' => RowTerms,
       'io_type' => IoType,
       'addresses' => Addresses
     }.
