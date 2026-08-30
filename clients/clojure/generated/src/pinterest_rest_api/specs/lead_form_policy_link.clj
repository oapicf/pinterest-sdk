(ns pinterest-rest-api.specs.lead-form-policy-link
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def lead-form-policy-link-data
  {
   (ds/opt :label) string?
   (ds/opt :link) string?
   })

(def lead-form-policy-link-spec
  (ds/spec
    {:name ::lead-form-policy-link
     :spec lead-form-policy-link-data}))
