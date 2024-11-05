(ns pinterest-rest-api.specs.lead-form-test-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def lead-form-test-request-data
  {
   (ds/req :answers) (s/coll-of string?)
   })

(def lead-form-test-request-spec
  (ds/spec
    {:name ::lead-form-test-request
     :spec lead-form-test-request-data}))
