(ns pinterest-rest-api.specs.catalogs-product-group-multiple-media-types-criteria
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.media-type :refer :all]
            )
  (:import (java.io File)))


(def catalogs-product-group-multiple-media-types-criteria-data
  {
   (ds/req :values) (s/coll-of media-type-spec)
   (ds/opt :negated) boolean?
   })

(def catalogs-product-group-multiple-media-types-criteria-spec
  (ds/spec
    {:name ::catalogs-product-group-multiple-media-types-criteria
     :spec catalogs-product-group-multiple-media-types-criteria-data}))
