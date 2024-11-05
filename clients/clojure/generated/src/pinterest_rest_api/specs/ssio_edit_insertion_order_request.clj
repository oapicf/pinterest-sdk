(ns pinterest-rest-api.specs.ssio-edit-insertion-order-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ssio-edit-insertion-order-request-data
  {
   (ds/opt :start_date) string?
   (ds/opt :end_date) string?
   (ds/opt :po_number) string?
   (ds/opt :budget_amount) float?
   (ds/opt :billing_contact_firstname) string?
   (ds/opt :billing_contact_lastname) string?
   (ds/opt :billing_contact_email) string?
   (ds/opt :media_contact_firstname) string?
   (ds/opt :media_contact_lastname) string?
   (ds/opt :media_contact_email) string?
   (ds/opt :agency_link) string?
   (ds/opt :user_email) string?
   (ds/opt :oracle_line_id) string?
   (ds/opt :salesforce_order_id) string?
   (ds/opt :salesforce_order_line_id) string?
   (ds/opt :ads_manager_order_line_id) string?
   })

(def ssio-edit-insertion-order-request-spec
  (ds/spec
    {:name ::ssio-edit-insertion-order-request
     :spec ssio-edit-insertion-order-request-data}))
