(ns pinterest-rest-api.specs.conversion-events-user-data-any-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-events-user-data-any-of-data
  {
   (ds/req :em) (s/coll-of string?)
   (ds/opt :hashed_maids) (s/coll-of string?)
   (ds/opt :client_ip_address) string?
   (ds/opt :client_user_agent) string?
   })

(def conversion-events-user-data-any-of-spec
  (ds/spec
    {:name ::conversion-events-user-data-any-of
     :spec conversion-events-user-data-any-of-data}))
