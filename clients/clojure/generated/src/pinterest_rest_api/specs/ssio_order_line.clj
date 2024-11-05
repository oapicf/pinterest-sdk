(ns pinterest-rest-api.specs.ssio-order-line
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.currency :refer :all]
            )
  (:import (java.io File)))


(def ssio-order-line-data
  {
   (ds/opt :salesforce_order_line_id) string?
   (ds/opt :ads_manager_order_line_id) string?
   (ds/opt :pin_order_id) string?
   (ds/opt :last_modified_date_time) string?
   (ds/opt :start_date) inst?
   (ds/opt :end_date) inst?
   (ds/opt :bill_to_company_name) string?
   (ds/opt :billing_contact_firstname) string?
   (ds/opt :billing_contact_lastname) string?
   (ds/opt :billing_contact_email) string?
   (ds/opt :media_contact_email) string?
   (ds/opt :media_contact_firstname) string?
   (ds/opt :media_contact_lastname) string?
   (ds/opt :currency_info) currency-spec
   (ds/opt :agency_link) string?
   (ds/opt :po_number) string?
   (ds/opt :order_name) string?
   (ds/opt :pmp_name) string?
   (ds/opt :accepted_terms_id) string?
   (ds/opt :accepted_terms_time) string?
   (ds/opt :budget_amount) float?
   (ds/opt :estimated_monthly_spend) float?
   })

(def ssio-order-line-spec
  (ds/spec
    {:name ::ssio-order-line
     :spec ssio-order-line-data}))
