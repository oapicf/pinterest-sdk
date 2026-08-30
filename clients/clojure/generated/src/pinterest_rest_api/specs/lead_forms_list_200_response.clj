(ns pinterest-rest-api.specs.lead-forms-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.lead-form :refer :all]
            )
  (:import (java.io File)))


(def lead-forms-list-200-response-data
  {
   (ds/opt :bookmark) string?
   (ds/req :items) (s/coll-of lead-form-spec)
   })

(def lead-forms-list-200-response-spec
  (ds/spec
    {:name ::lead-forms-list-200-response
     :spec lead-forms-list-200-response-data}))
