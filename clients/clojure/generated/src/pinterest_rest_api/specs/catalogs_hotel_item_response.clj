(ns pinterest-rest-api.specs.catalogs-hotel-item-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-hotel-attributes :refer :all]
            [pinterest-rest-api.specs.catalogs-type :refer :all]
            [pinterest-rest-api.specs.pin :refer :all]
            )
  (:import (java.io File)))


(def catalogs-hotel-item-response-data
  {
   (ds/opt :attributes) catalogs-hotel-attributes-spec
   (ds/req :catalog_type) catalogs-type-spec
   (ds/opt :hotel_id) string?
   (ds/opt :pins) (s/coll-of pin-spec)
   })

(def catalogs-hotel-item-response-spec
  (ds/spec
    {:name ::catalogs-hotel-item-response
     :spec catalogs-hotel-item-response-data}))
