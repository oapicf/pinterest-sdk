(ns pinterest-rest-api.specs.conversion-deletion-request-targets
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-deletion-request-targets-data
  {
   (ds/req :user_emails) (s/coll-of string?)
   (ds/req :epiks) (s/coll-of string?)
   })

(def conversion-deletion-request-targets-spec
  (ds/spec
    {:name ::conversion-deletion-request-targets
     :spec conversion-deletion-request-targets-data}))
