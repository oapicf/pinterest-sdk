(ns pinterest-rest-api.specs.ssio-insertion-order-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.currency :refer :all]
            [pinterest-rest-api.specs.ssio-order-line-type :refer :all]
            )
  (:import (java.io File)))


(def ssio-insertion-order-create-data
  {
   (ds/req :accepted_terms_id) string?
   (ds/opt :accepted_terms_time) int?
   (ds/opt :agency_link) string?
   (ds/req :billing_contact_email) string?
   (ds/req :billing_contact_firstname) string?
   (ds/req :billing_contact_lastname) string?
   (ds/req :billto_billing_address_id) string?
   (ds/req :billto_business_address_id) string?
   (ds/req :billto_company_id) string?
   (ds/opt :budget_amount) float?
   (ds/req :currency_info) currency-spec
   (ds/opt :end_date) string?
   (ds/opt :estimated_monthly_spend) float?
   (ds/req :media_contact_email) string?
   (ds/req :media_contact_firstname) string?
   (ds/req :media_contact_lastname) string?
   (ds/req :order_line_type) ssio-order-line-type-spec
   (ds/req :order_name) string?
   (ds/req :pmp_id) string?
   (ds/req :po_number) string?
   (ds/req :start_date) string?
   (ds/opt :user_email) string?
   })

(def ssio-insertion-order-create-spec
  (ds/spec
    {:name ::ssio-insertion-order-create
     :spec ssio-insertion-order-create-data}))
