(ns pinterest-rest-api.specs.ssio-insertion-order-common
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ssio-insertion-order-common-data
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
   })

(def ssio-insertion-order-common-spec
  (ds/spec
    {:name ::ssio-insertion-order-common
     :spec ssio-insertion-order-common-data}))
