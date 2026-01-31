(ns pinterest-rest-api.specs.billing-invoice-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.currency :refer :all]
            )
  (:import (java.io File)))


(def billing-invoice-response-data
  {
   (ds/opt :ad_account_id) string?
   (ds/opt :ad_account_name) string?
   (ds/opt :amount_billed_micro_currency) int?
   (ds/opt :amount_discount_micro_currency) int?
   (ds/opt :amount_net_micro_currency) int?
   (ds/opt :amount_tax_micro_currency) int?
   (ds/opt :bill_to_country) string?
   (ds/opt :billing_period_end_date) inst?
   (ds/opt :billing_period_start_date) inst?
   (ds/opt :currency) currency-spec
   (ds/opt :document_type) string?
   (ds/opt :id) string?
   (ds/opt :invoice_due_date) inst?
   (ds/opt :payment_terms) string?
   (ds/opt :status) string?
   })

(def billing-invoice-response-spec
  (ds/spec
    {:name ::billing-invoice-response
     :spec billing-invoice-response-data}))
