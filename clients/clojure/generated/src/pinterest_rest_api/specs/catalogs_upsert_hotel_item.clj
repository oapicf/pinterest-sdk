(ns pinterest-rest-api.specs.catalogs-upsert-hotel-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-hotel-attributes :refer :all]
            )
  (:import (java.io File)))


(def catalogs-upsert-hotel-item-data
  {
   (ds/req :hotel_id) string?
   (ds/req :operation) string?
   (ds/req :attributes) catalogs-hotel-attributes-spec
   })

(def catalogs-upsert-hotel-item-spec
  (ds/spec
    {:name ::catalogs-upsert-hotel-item
     :spec catalogs-upsert-hotel-item-data}))
