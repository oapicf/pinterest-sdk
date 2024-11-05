(ns pinterest-rest-api.specs.terms-of-service
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def terms-of-service-data
  {
   (ds/opt :id) string?
   (ds/opt :html) string?
   (ds/opt :has_accepted) boolean?
   (ds/opt :ad_account_id) string?
   })

(def terms-of-service-spec
  (ds/spec
    {:name ::terms-of-service
     :spec terms-of-service-data}))
