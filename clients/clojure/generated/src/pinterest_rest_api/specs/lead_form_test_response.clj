(ns pinterest-rest-api.specs.lead-form-test-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def lead-form-test-response-data
  {
   (ds/opt :subscription_id) string?
   })

(def lead-form-test-response-spec
  (ds/spec
    {:name ::lead-form-test-response
     :spec lead-form-test-response-data}))
