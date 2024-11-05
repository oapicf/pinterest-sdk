(ns pinterest-rest-api.specs.conversion-events-user-data-any-of-1
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-events-user-data-any-of-1-data
  {
   (ds/opt :em) (s/coll-of string?)
   (ds/req :hashed_maids) (s/coll-of string?)
   (ds/opt :client_ip_address) string?
   (ds/opt :client_user_agent) string?
   })

(def conversion-events-user-data-any-of-1-spec
  (ds/spec
    {:name ::conversion-events-user-data-any-of-1
     :spec conversion-events-user-data-any-of-1-data}))
