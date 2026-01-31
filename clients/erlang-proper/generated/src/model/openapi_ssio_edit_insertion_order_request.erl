-module(openapi_ssio_edit_insertion_order_request).

-include("openapi.hrl").

-export([openapi_ssio_edit_insertion_order_request/0]).

-export([openapi_ssio_edit_insertion_order_request/1]).

-export_type([openapi_ssio_edit_insertion_order_request/0]).

-type openapi_ssio_edit_insertion_order_request() ::
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
  | {'ads_manager_order_line_id', binary() }
  | {'oracle_line_id', binary() }
  | {'salesforce_order_id', binary() }
  | {'salesforce_order_line_id', binary() }
  ].


openapi_ssio_edit_insertion_order_request() ->
    openapi_ssio_edit_insertion_order_request([]).

openapi_ssio_edit_insertion_order_request(Fields) ->
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
            , {'ads_manager_order_line_id', binary() }
            , {'oracle_line_id', binary() }
            , {'salesforce_order_id', binary() }
            , {'salesforce_order_line_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

