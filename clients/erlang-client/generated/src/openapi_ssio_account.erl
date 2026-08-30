-module(openapi_ssio_account).

-export([encode/1]).

-export_type([openapi_ssio_account/0]).

-type openapi_ssio_account() ::
    #{ 'billto_infos' => list(),
       'can_edit' => boolean(),
       'currency' => binary(),
       'eligible' => boolean(),
       'error' => binary(),
       'pmp_names' => list()
     }.

encode(#{ 'billto_infos' := BilltoInfos,
          'can_edit' := CanEdit,
          'currency' := Currency,
          'eligible' := Eligible,
          'error' := Error,
          'pmp_names' := PmpNames
        }) ->
    #{ 'billto_infos' => BilltoInfos,
       'can_edit' => CanEdit,
       'currency' => Currency,
       'eligible' => Eligible,
       'error' => Error,
       'pmp_names' => PmpNames
     }.
