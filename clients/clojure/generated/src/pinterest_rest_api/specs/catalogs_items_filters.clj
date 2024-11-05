(ns pinterest-rest-api.specs.catalogs-items-filters
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-type :refer :all]
            )
  (:import (java.io File)))


(def catalogs-items-filters-data
  {
   (ds/req :catalog_type) catalogs-type-spec
   (ds/req :item_ids) (s/coll-of string?)
   (ds/opt :catalog_id) string?
   (ds/req :hotel_ids) (s/coll-of string?)
   (ds/req :creative_assets_ids) (s/coll-of string?)
   })

(def catalogs-items-filters-spec
  (ds/spec
    {:name ::catalogs-items-filters
     :spec catalogs-items-filters-data}))
