(ns pinterest-rest-api.specs.audience-insight-category-array-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.audience-insight-category-common :refer :all]
            )
  (:import (java.io File)))


(def audience-insight-category-array-response-data
  {
   (ds/opt :items) (s/coll-of audience-insight-category-common-spec)
   })

(def audience-insight-category-array-response-spec
  (ds/spec
    {:name ::audience-insight-category-array-response
     :spec audience-insight-category-array-response-data}))
