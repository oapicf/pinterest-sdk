(ns pinterest-rest-api.specs.ad-group-id-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-group-id-filter-data
  {
   (ds/opt :ad_group_ids) (s/coll-of string?)
   })

(def ad-group-id-filter-spec
  (ds/spec
    {:name ::ad-group-id-filter
     :spec ad-group-id-filter-data}))
