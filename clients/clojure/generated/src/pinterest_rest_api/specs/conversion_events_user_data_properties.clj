(ns pinterest-rest-api.specs.conversion-events-user-data-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-events-user-data-properties-data
  {
   (ds/opt :click_id) string?
   (ds/opt :client_ip_address) string?
   (ds/opt :client_user_agent) string?
   (ds/opt :country) (s/coll-of string?)
   (ds/opt :ct) (s/coll-of string?)
   (ds/opt :db) (s/coll-of string?)
   (ds/opt :em) (s/coll-of string?)
   (ds/opt :external_id) (s/coll-of string?)
   (ds/opt :fn) (s/coll-of string?)
   (ds/opt :ge) (s/coll-of string?)
   (ds/opt :hashed_maids) (s/coll-of string?)
   (ds/opt :ln) (s/coll-of string?)
   (ds/opt :partner_id) string?
   (ds/opt :ph) (s/coll-of string?)
   (ds/opt :st) (s/coll-of string?)
   (ds/opt :zp) (s/coll-of string?)
   })

(def conversion-events-user-data-properties-spec
  (ds/spec
    {:name ::conversion-events-user-data-properties
     :spec conversion-events-user-data-properties-data}))
