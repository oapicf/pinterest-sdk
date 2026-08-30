-module(openapi_ssio_insertion_order_update).

-include("openapi.hrl").

-export([openapi_ssio_insertion_order_update/0]).

-export([openapi_ssio_insertion_order_update/1]).

-export_type([openapi_ssio_insertion_order_update/0]).

-type openapi_ssio_insertion_order_update() ::
  [ {'ads_manager_order_line_id', binary() }
  | {'agency_link', binary() }
  | {'billing_contact_email', binary() }
  | {'billing_contact_firstname', binary() }
  | {'billing_contact_lastname', binary() }
  | {'budget_amount', float() }
  | {'end_date', binary() }
  | {'media_contact_email', binary() }
  | {'media_contact_firstname', binary() }
  | {'media_contact_lastname', binary() }
  | {'oracle_line_id', binary() }
  | {'po_number', binary() }
  | {'salesforce_order_id', binary() }
  | {'salesforce_order_line_id', binary() }
  | {'start_date', binary() }
  | {'user_email', binary() }
  ].


openapi_ssio_insertion_order_update() ->
    openapi_ssio_insertion_order_update([]).

openapi_ssio_insertion_order_update(Fields) ->
  Default = [ {'ads_manager_order_line_id', binary() }
            , {'agency_link', binary() }
            , {'billing_contact_email', binary() }
            , {'billing_contact_firstname', binary() }
            , {'billing_contact_lastname', binary() }
            , {'budget_amount', float() }
            , {'end_date', binary() }
            , {'media_contact_email', binary() }
            , {'media_contact_firstname', binary() }
            , {'media_contact_lastname', binary() }
            , {'oracle_line_id', binary() }
            , {'po_number', binary() }
            , {'salesforce_order_id', binary() }
            , {'salesforce_order_line_id', binary() }
            , {'start_date', binary() }
            , {'user_email', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

