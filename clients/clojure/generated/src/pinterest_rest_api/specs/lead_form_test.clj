(ns pinterest-rest-api.specs.lead-form-test
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def lead-form-test-data
  {
   (ds/opt :subscription_id) string?
   })

(def lead-form-test-spec
  (ds/spec
    {:name ::lead-form-test
     :spec lead-form-test-data}))
