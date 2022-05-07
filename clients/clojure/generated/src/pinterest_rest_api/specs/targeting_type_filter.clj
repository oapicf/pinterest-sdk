(ns pinterest-rest-api.specs.targeting-type-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ads-analytics-targeting-type :refer :all]
            )
  (:import (java.io File)))


(def targeting-type-filter-data
  {
   (ds/opt :targeting_types) (s/coll-of ads-analytics-targeting-type-spec)
   })

(def targeting-type-filter-spec
  (ds/spec
    {:name ::targeting-type-filter
     :spec targeting-type-filter-data}))
