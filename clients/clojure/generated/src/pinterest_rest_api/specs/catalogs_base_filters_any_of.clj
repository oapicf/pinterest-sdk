(ns pinterest-rest-api.specs.catalogs-base-filters-any-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-base-filter-keys :refer :all]
            )
  (:import (java.io File)))


(def catalogs-base-filters-any-of-data
  {
   (ds/req :any_of) (s/coll-of catalogs-base-filter-keys-spec)
   })

(def catalogs-base-filters-any-of-spec
  (ds/spec
    {:name ::catalogs-base-filters-any-of
     :spec catalogs-base-filters-any-of-data}))
