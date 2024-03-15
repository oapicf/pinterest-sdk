-module(openapi_ssio_account_response).

-export([encode/1]).

-export_type([openapi_ssio_account_response/0]).

-type openapi_ssio_account_response() ::
    #{ 'eligible' => boolean(),
       'can_edit' => boolean(),
       'billto_infos' => list(),
       'currency' => binary(),
       'pmp_names' => list(),
       'error' => binary()
     }.

encode(#{ 'eligible' := Eligible,
          'can_edit' := CanEdit,
          'billto_infos' := BilltoInfos,
          'currency' := Currency,
          'pmp_names' := PmpNames,
          'error' := Error
        }) ->
    #{ 'eligible' => Eligible,
       'can_edit' => CanEdit,
       'billto_infos' => BilltoInfos,
       'currency' => Currency,
       'pmp_names' => PmpNames,
       'error' => Error
     }.
