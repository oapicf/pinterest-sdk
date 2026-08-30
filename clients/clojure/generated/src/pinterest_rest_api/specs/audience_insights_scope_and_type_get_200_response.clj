(ns pinterest-rest-api.specs.audience-insights-scope-and-type-get-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.audience-definition :refer :all]
            )
  (:import (java.io File)))


(def audience-insights-scope-and-type-get-200-response-data
  {
   (ds/req :items) (s/coll-of audience-definition-spec)
   })

(def audience-insights-scope-and-type-get-200-response-spec
  (ds/spec
    {:name ::audience-insights-scope-and-type-get-200-response
     :spec audience-insights-scope-and-type-get-200-response-data}))
