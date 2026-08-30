(ns pinterest-rest-api.specs.catalogs-base-filters-all-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-base-filter-keys :refer :all]
            )
  (:import (java.io File)))


(def catalogs-base-filters-all-of-data
  {
   (ds/req :all_of) (s/coll-of catalogs-base-filter-keys-spec)
   })

(def catalogs-base-filters-all-of-spec
  (ds/spec
    {:name ::catalogs-base-filters-all-of
     :spec catalogs-base-filters-all-of-data}))
