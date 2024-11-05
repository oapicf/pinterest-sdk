(ns pinterest-rest-api.specs.catalogs-update-hotel-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-updatable-hotel-attributes :refer :all]
            )
  (:import (java.io File)))


(def catalogs-update-hotel-item-data
  {
   (ds/req :hotel_id) string?
   (ds/req :operation) string?
   (ds/req :attributes) catalogs-updatable-hotel-attributes-spec
   })

(def catalogs-update-hotel-item-spec
  (ds/spec
    {:name ::catalogs-update-hotel-item
     :spec catalogs-update-hotel-item-data}))
