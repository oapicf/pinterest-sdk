(ns pinterest-rest-api.specs.catalogs-hotel-batch-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-updatable-hotel-attributes :refer :all]
            )
  (:import (java.io File)))


(def catalogs-hotel-batch-item-data
  {
   (ds/req :hotel_id) string?
   (ds/req :operation) string?
   (ds/req :attributes) catalogs-updatable-hotel-attributes-spec
   })

(def catalogs-hotel-batch-item-spec
  (ds/spec
    {:name ::catalogs-hotel-batch-item
     :spec catalogs-hotel-batch-item-data}))
