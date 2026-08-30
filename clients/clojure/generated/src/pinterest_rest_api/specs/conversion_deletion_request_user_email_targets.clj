(ns pinterest-rest-api.specs.conversion-deletion-request-user-email-targets
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-deletion-request-user-email-targets-data
  {
   (ds/req :user_emails) (s/coll-of string?)
   })

(def conversion-deletion-request-user-email-targets-spec
  (ds/spec
    {:name ::conversion-deletion-request-user-email-targets
     :spec conversion-deletion-request-user-email-targets-data}))
