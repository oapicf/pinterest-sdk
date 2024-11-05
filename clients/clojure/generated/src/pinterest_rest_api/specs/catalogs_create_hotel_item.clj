(ns pinterest-rest-api.specs.catalogs-create-hotel-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-hotel-attributes :refer :all]
            )
  (:import (java.io File)))


(def catalogs-create-hotel-item-data
  {
   (ds/req :hotel_id) string?
   (ds/req :operation) string?
   (ds/req :attributes) catalogs-hotel-attributes-spec
   })

(def catalogs-create-hotel-item-spec
  (ds/spec
    {:name ::catalogs-create-hotel-item
     :spec catalogs-create-hotel-item-data}))
