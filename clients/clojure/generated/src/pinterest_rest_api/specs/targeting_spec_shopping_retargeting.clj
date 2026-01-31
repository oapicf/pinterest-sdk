(ns pinterest-rest-api.specs.targeting-spec-shopping-retargeting
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def targeting-spec-shopping-retargeting-data
  {
   (ds/opt :exclusion_window) int?
   (ds/opt :lookback_window) int?
   (ds/opt :tag_types) (s/coll-of int?)
   })

(def targeting-spec-shopping-retargeting-spec
  (ds/spec
    {:name ::targeting-spec-shopping-retargeting
     :spec targeting-spec-shopping-retargeting-data}))
