(ns pinterest-rest-api.specs.lead-form-test-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def lead-form-test-create-data
  {
   (ds/req :answers) (s/coll-of string?)
   })

(def lead-form-test-create-spec
  (ds/spec
    {:name ::lead-form-test-create
     :spec lead-form-test-create-data}))
