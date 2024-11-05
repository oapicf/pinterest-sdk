(ns pinterest-rest-api.specs.catalogs-hotel-product-metadata
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-hotel-product-metadata-data
  {
   (ds/req :hotel_id) string?
   })

(def catalogs-hotel-product-metadata-spec
  (ds/spec
    {:name ::catalogs-hotel-product-metadata
     :spec catalogs-hotel-product-metadata-data}))
