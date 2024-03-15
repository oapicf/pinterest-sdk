-module(openapi_ssio_order_line).

-include("openapi.hrl").

-export([openapi_ssio_order_line/0]).

-export([openapi_ssio_order_line/1]).

-export_type([openapi_ssio_order_line/0]).

-type openapi_ssio_order_line() ::
  [ {'salesforce_order_line_id', binary() }
  | {'ads_manager_order_line_id', binary() }
  | {'pin_order_id', binary() }
  | {'last_modified_date_time', binary() }
  | {'start_date', date() }
  | {'end_date', date() }
  | {'bill_to_company_name', binary() }
  | {'billing_contact_firstname', binary() }
  | {'billing_contact_lastname', binary() }
  | {'billing_contact_email', binary() }
  | {'media_contact_email', binary() }
  | {'media_contact_firstname', binary() }
  | {'media_contact_lastname', binary() }
  | {'currency_info', openapi_currency:openapi_currency() }
  | {'agency_link', binary() }
  | {'po_number', binary() }
  | {'order_name', binary() }
  | {'pmp_name', binary() }
  | {'accepted_terms_id', binary() }
  | {'accepted_terms_time', binary() }
  | {'budget_amount', integer() }
  | {'estimated_monthly_spend', integer() }
  ].


openapi_ssio_order_line() ->
    openapi_ssio_order_line([]).

openapi_ssio_order_line(Fields) ->
  Default = [ {'salesforce_order_line_id', binary() }
            , {'ads_manager_order_line_id', binary() }
            , {'pin_order_id', binary() }
            , {'last_modified_date_time', binary() }
            , {'start_date', date() }
            , {'end_date', date() }
            , {'bill_to_company_name', binary() }
            , {'billing_contact_firstname', binary() }
            , {'billing_contact_lastname', binary() }
            , {'billing_contact_email', binary() }
            , {'media_contact_email', binary() }
            , {'media_contact_firstname', binary() }
            , {'media_contact_lastname', binary() }
            , {'currency_info', openapi_currency:openapi_currency() }
            , {'agency_link', binary() }
            , {'po_number', binary() }
            , {'order_name', binary() }
            , {'pmp_name', binary() }
            , {'accepted_terms_id', binary() }
            , {'accepted_terms_time', binary() }
            , {'budget_amount', integer() }
            , {'estimated_monthly_spend', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

