-module(openapi_ssio_account_pmp_name).

-export([encode/1]).

-export_type([openapi_ssio_account_pmp_name/0]).

-type openapi_ssio_account_pmp_name() ::
    #{ 'name' => binary(),
       'id' => binary()
     }.

encode(#{ 'name' := Name,
          'id' := Id
        }) ->
    #{ 'name' => Name,
       'id' => Id
     }.
