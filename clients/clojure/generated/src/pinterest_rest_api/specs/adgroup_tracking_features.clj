(ns pinterest-rest-api.specs.adgroup-tracking-features
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.adgroup-tracking-feature-type :refer :all]
            )
  (:import (java.io File)))


(def adgroup-tracking-features-data
  {
   (ds/opt :enabled) (s/coll-of adgroup-tracking-feature-type-spec)
   })

(def adgroup-tracking-features-spec
  (ds/spec
    {:name ::adgroup-tracking-features
     :spec adgroup-tracking-features-data}))
