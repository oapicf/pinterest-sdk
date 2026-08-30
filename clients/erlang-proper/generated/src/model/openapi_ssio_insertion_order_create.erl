-module(openapi_ssio_insertion_order_create).

-include("openapi.hrl").

-export([openapi_ssio_insertion_order_create/0]).

-export([openapi_ssio_insertion_order_create/1]).

-export_type([openapi_ssio_insertion_order_create/0]).

-type openapi_ssio_insertion_order_create() ::
  [ {'accepted_terms_id', binary() }
  | {'accepted_terms_time', integer() }
  | {'agency_link', binary() }
  | {'billing_contact_email', binary() }
  | {'billing_contact_firstname', binary() }
  | {'billing_contact_lastname', binary() }
  | {'billto_billing_address_id', binary() }
  | {'billto_business_address_id', binary() }
  | {'billto_company_id', binary() }
  | {'budget_amount', float() }
  | {'currency_info', openapi_currency:openapi_currency() }
  | {'end_date', binary() }
  | {'estimated_monthly_spend', float() }
  | {'media_contact_email', binary() }
  | {'media_contact_firstname', binary() }
  | {'media_contact_lastname', binary() }
  | {'order_line_type', openapi_s_sio_order_line_type:openapi_s_sio_order_line_type() }
  | {'order_name', binary() }
  | {'pmp_id', binary() }
  | {'po_number', binary() }
  | {'start_date', binary() }
  | {'user_email', binary() }
  ].


openapi_ssio_insertion_order_create() ->
    openapi_ssio_insertion_order_create([]).

openapi_ssio_insertion_order_create(Fields) ->
  Default = [ {'accepted_terms_id', binary() }
            , {'accepted_terms_time', integer() }
            , {'agency_link', binary() }
            , {'billing_contact_email', binary() }
            , {'billing_contact_firstname', binary() }
            , {'billing_contact_lastname', binary() }
            , {'billto_billing_address_id', binary() }
            , {'billto_business_address_id', binary() }
            , {'billto_company_id', binary() }
            , {'budget_amount', float() }
            , {'currency_info', openapi_currency:openapi_currency() }
            , {'end_date', binary() }
            , {'estimated_monthly_spend', float() }
            , {'media_contact_email', binary() }
            , {'media_contact_firstname', binary() }
            , {'media_contact_lastname', binary() }
            , {'order_line_type', openapi_s_sio_order_line_type:openapi_s_sio_order_line_type() }
            , {'order_name', binary() }
            , {'pmp_id', binary() }
            , {'po_number', binary() }
            , {'start_date', binary() }
            , {'user_email', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

