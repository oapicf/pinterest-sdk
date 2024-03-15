-module(openapi_ssio_insertion_order_common).

-include("openapi.hrl").

-export([openapi_ssio_insertion_order_common/0]).

-export([openapi_ssio_insertion_order_common/1]).

-export_type([openapi_ssio_insertion_order_common/0]).

-type openapi_ssio_insertion_order_common() ::
  [ {'start_date', binary() }
  | {'end_date', binary() }
  | {'po_number', binary() }
  | {'budget_amount', integer() }
  | {'billing_contact_firstname', binary() }
  | {'billing_contact_lastname', binary() }
  | {'billing_contact_email', binary() }
  | {'media_contact_firstname', binary() }
  | {'media_contact_lastname', binary() }
  | {'media_contact_email', binary() }
  | {'agency_link', binary() }
  | {'user_email', binary() }
  ].


openapi_ssio_insertion_order_common() ->
    openapi_ssio_insertion_order_common([]).

openapi_ssio_insertion_order_common(Fields) ->
  Default = [ {'start_date', binary() }
            , {'end_date', binary() }
            , {'po_number', binary() }
            , {'budget_amount', integer() }
            , {'billing_contact_firstname', binary() }
            , {'billing_contact_lastname', binary() }
            , {'billing_contact_email', binary() }
            , {'media_contact_firstname', binary() }
            , {'media_contact_lastname', binary() }
            , {'media_contact_email', binary() }
            , {'agency_link', binary() }
            , {'user_email', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

