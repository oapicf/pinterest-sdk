-module(openapi_ssio_edit_insertion_order_request).

-include("openapi.hrl").

-export([openapi_ssio_edit_insertion_order_request/0]).

-export([openapi_ssio_edit_insertion_order_request/1]).

-export_type([openapi_ssio_edit_insertion_order_request/0]).

-type openapi_ssio_edit_insertion_order_request() ::
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
  | {'oracle_line_id', binary() }
  | {'salesforce_order_id', binary() }
  | {'salesforce_order_line_id', binary() }
  | {'ads_manager_order_line_id', binary() }
  ].


openapi_ssio_edit_insertion_order_request() ->
    openapi_ssio_edit_insertion_order_request([]).

openapi_ssio_edit_insertion_order_request(Fields) ->
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
            , {'oracle_line_id', binary() }
            , {'salesforce_order_id', binary() }
            , {'salesforce_order_line_id', binary() }
            , {'ads_manager_order_line_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

