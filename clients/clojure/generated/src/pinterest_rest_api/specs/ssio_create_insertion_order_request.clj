(ns pinterest-rest-api.specs.ssio-create-insertion-order-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.currency :refer :all]
            )
  (:import (java.io File)))


(def ssio-create-insertion-order-request-data
  {
   (ds/opt :agency_link) string?
   (ds/req :billing_contact_email) string?
   (ds/req :billing_contact_firstname) string?
   (ds/req :billing_contact_lastname) string?
   (ds/opt :budget_amount) float?
   (ds/opt :end_date) string?
   (ds/req :media_contact_email) string?
   (ds/req :media_contact_firstname) string?
   (ds/req :media_contact_lastname) string?
   (ds/req :po_number) string?
   (ds/req :start_date) string?
   (ds/opt :user_email) string?
   (ds/req :accepted_terms_id) string?
   (ds/opt :accepted_terms_time) int?
   (ds/req :billto_billing_address_id) string?
   (ds/req :billto_business_address_id) string?
   (ds/req :billto_company_id) string?
   (ds/req :currency_info) currency-spec
   (ds/opt :estimated_monthly_spend) float?
   (ds/req :order_line_type) string?
   (ds/req :order_name) string?
   (ds/req :pmp_id) string?
   })

(def ssio-create-insertion-order-request-spec
  (ds/spec
    {:name ::ssio-create-insertion-order-request
     :spec ssio-create-insertion-order-request-data}))
