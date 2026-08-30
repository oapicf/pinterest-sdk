-module(openapi_billing_invoice).

-export([encode/1]).

-export_type([openapi_billing_invoice/0]).

-type openapi_billing_invoice() ::
    #{ 'ad_account_id' => binary(),
       'ad_account_name' => binary(),
       'amount_billed_micro_currency' => integer(),
       'amount_discount_micro_currency' => integer(),
       'amount_net_micro_currency' => integer(),
       'amount_tax_micro_currency' => integer(),
       'bill_to_country' => binary(),
       'billing_period_end_date' => calendar:date(),
       'billing_period_start_date' => calendar:date(),
       'currency' => openapi_currency:openapi_currency(),
       'document_type' => openapi_billing_invoice_document_type:openapi_billing_invoice_document_type(),
       'id' => binary(),
       'invoice_due_date' => calendar:date(),
       'payment_terms' => binary(),
       'status' => openapi_billing_invoice_status:openapi_billing_invoice_status()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'ad_account_name' := AdAccountName,
          'amount_billed_micro_currency' := AmountBilledMicroCurrency,
          'amount_discount_micro_currency' := AmountDiscountMicroCurrency,
          'amount_net_micro_currency' := AmountNetMicroCurrency,
          'amount_tax_micro_currency' := AmountTaxMicroCurrency,
          'bill_to_country' := BillToCountry,
          'billing_period_end_date' := BillingPeriodEndDate,
          'billing_period_start_date' := BillingPeriodStartDate,
          'currency' := Currency,
          'document_type' := DocumentType,
          'id' := Id,
          'invoice_due_date' := InvoiceDueDate,
          'payment_terms' := PaymentTerms,
          'status' := Status
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'ad_account_name' => AdAccountName,
       'amount_billed_micro_currency' => AmountBilledMicroCurrency,
       'amount_discount_micro_currency' => AmountDiscountMicroCurrency,
       'amount_net_micro_currency' => AmountNetMicroCurrency,
       'amount_tax_micro_currency' => AmountTaxMicroCurrency,
       'bill_to_country' => BillToCountry,
       'billing_period_end_date' => BillingPeriodEndDate,
       'billing_period_start_date' => BillingPeriodStartDate,
       'currency' => Currency,
       'document_type' => DocumentType,
       'id' => Id,
       'invoice_due_date' => InvoiceDueDate,
       'payment_terms' => PaymentTerms,
       'status' => Status
     }.
