(ns pinterest-rest-api.specs.ssio-insertion-order-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ssio-insertion-order-update-data
  {
   (ds/opt :ads_manager_order_line_id) string?
   (ds/opt :agency_link) string?
   (ds/opt :billing_contact_email) string?
   (ds/opt :billing_contact_firstname) string?
   (ds/opt :billing_contact_lastname) string?
   (ds/opt :budget_amount) float?
   (ds/opt :end_date) string?
   (ds/opt :media_contact_email) string?
   (ds/opt :media_contact_firstname) string?
   (ds/opt :media_contact_lastname) string?
   (ds/opt :oracle_line_id) string?
   (ds/opt :po_number) string?
   (ds/opt :salesforce_order_id) string?
   (ds/opt :salesforce_order_line_id) string?
   (ds/opt :start_date) string?
   (ds/opt :user_email) string?
   })

(def ssio-insertion-order-update-spec
  (ds/spec
    {:name ::ssio-insertion-order-update
     :spec ssio-insertion-order-update-data}))
