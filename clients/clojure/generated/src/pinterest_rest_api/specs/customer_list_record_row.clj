(ns pinterest-rest-api.specs.customer-list-record-row
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def customer-list-record-row-data
  {
   (ds/opt :email) string?
   (ds/opt :external_id) string?
   (ds/opt :hashed_phone_number) string?
   (ds/opt :hashed_pinner_id) string?
   (ds/opt :ip_address) string?
   (ds/opt :liveramp_envelope) string?
   (ds/opt :maid) string?
   (ds/opt :user_agent) string?
   })

(def customer-list-record-row-spec
  (ds/spec
    {:name ::customer-list-record-row
     :spec customer-list-record-row-data}))
