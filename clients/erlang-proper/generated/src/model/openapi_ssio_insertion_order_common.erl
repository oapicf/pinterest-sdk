-module(openapi_ssio_insertion_order_common).

-include("openapi.hrl").

-export([openapi_ssio_insertion_order_common/0]).

-export([openapi_ssio_insertion_order_common/1]).

-export_type([openapi_ssio_insertion_order_common/0]).

-type openapi_ssio_insertion_order_common() ::
  [ {'agency_link', binary() }
  | {'billing_contact_email', binary() }
  | {'billing_contact_firstname', binary() }
  | {'billing_contact_lastname', binary() }
  | {'budget_amount', integer() }
  | {'end_date', binary() }
  | {'media_contact_email', binary() }
  | {'media_contact_firstname', binary() }
  | {'media_contact_lastname', binary() }
  | {'po_number', binary() }
  | {'start_date', binary() }
  | {'user_email', binary() }
  ].


openapi_ssio_insertion_order_common() ->
    openapi_ssio_insertion_order_common([]).

openapi_ssio_insertion_order_common(Fields) ->
  Default = [ {'agency_link', binary() }
            , {'billing_contact_email', binary() }
            , {'billing_contact_firstname', binary() }
            , {'billing_contact_lastname', binary() }
            , {'budget_amount', integer() }
            , {'end_date', binary() }
            , {'media_contact_email', binary() }
            , {'media_contact_firstname', binary() }
            , {'media_contact_lastname', binary() }
            , {'po_number', binary() }
            , {'start_date', binary() }
            , {'user_email', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

