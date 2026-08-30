(ns pinterest-rest-api.specs.audience-insights
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.audience-category :refer :all]
            [pinterest-rest-api.specs.audience-demographics :refer :all]
            [pinterest-rest-api.specs.audience-insight-type :refer :all]
            )
  (:import (java.io File)))


(def audience-insights-data
  {
   (ds/opt :categories) (s/coll-of audience-category-spec)
   (ds/opt :date) string?
   (ds/opt :demographics) audience-demographics-spec
   (ds/opt :size) int?
   (ds/opt :size_is_upper_bound) boolean?
   (ds/opt :type) audience-insight-type-spec
   })

(def audience-insights-spec
  (ds/spec
    {:name ::audience-insights
     :spec audience-insights-data}))
