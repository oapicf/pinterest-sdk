(ns pinterest-rest-api.specs.lead-form-common-policy-links-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def lead-form-common-policy-links-inner-data
  {
   (ds/opt :label) string?
   (ds/opt :link) string?
   })

(def lead-form-common-policy-links-inner-spec
  (ds/spec
    {:name ::lead-form-common-policy-links-inner
     :spec lead-form-common-policy-links-inner-data}))
