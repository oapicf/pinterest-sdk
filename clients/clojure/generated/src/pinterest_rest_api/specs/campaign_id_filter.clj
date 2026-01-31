(ns pinterest-rest-api.specs.campaign-id-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def campaign-id-filter-data
  {
   (ds/opt :campaign_ids) (s/coll-of string?)
   })

(def campaign-id-filter-spec
  (ds/spec
    {:name ::campaign-id-filter
     :spec campaign-id-filter-data}))
