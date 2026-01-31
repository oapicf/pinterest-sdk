(ns pinterest-rest-api.specs.catalogs-hotel-filter-values-map
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-hotel-filter-values-map-data
  {
   (ds/opt :brand) (s/coll-of string?)
   (ds/opt :custom_label_0) (s/coll-of string?)
   (ds/opt :custom_label_1) (s/coll-of string?)
   (ds/opt :custom_label_2) (s/coll-of string?)
   (ds/opt :custom_label_3) (s/coll-of string?)
   (ds/opt :custom_label_4) (s/coll-of string?)
   })

(def catalogs-hotel-filter-values-map-spec
  (ds/spec
    {:name ::catalogs-hotel-filter-values-map
     :spec catalogs-hotel-filter-values-map-data}))
