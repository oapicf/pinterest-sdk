(ns pinterest-rest-api.specs.conversion-events-user-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-events-user-data-data
  {
   (ds/opt :ph) (s/coll-of string?)
   (ds/opt :ge) (s/coll-of string?)
   (ds/opt :db) (s/coll-of string?)
   (ds/opt :ln) (s/coll-of string?)
   (ds/opt :fn) (s/coll-of string?)
   (ds/opt :ct) (s/coll-of string?)
   (ds/opt :st) (s/coll-of string?)
   (ds/opt :zp) (s/coll-of string?)
   (ds/opt :country) (s/coll-of string?)
   (ds/opt :external_id) (s/coll-of string?)
   (ds/opt :click_id) string?
   (ds/opt :partner_id) string?
   (ds/req :em) (s/coll-of string?)
   (ds/req :hashed_maids) (s/coll-of string?)
   (ds/req :client_ip_address) string?
   (ds/req :client_user_agent) string?
   })

(def conversion-events-user-data-spec
  (ds/spec
    {:name ::conversion-events-user-data
     :spec conversion-events-user-data-data}))
