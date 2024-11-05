(ns pinterest-rest-api.specs.catalogs-hotel-item-error-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-type :refer :all]
            [pinterest-rest-api.specs.item-validation-event :refer :all]
            )
  (:import (java.io File)))


(def catalogs-hotel-item-error-response-data
  {
   (ds/req :catalog_type) catalogs-type-spec
   (ds/opt :hotel_id) string?
   (ds/opt :errors) (s/coll-of item-validation-event-spec)
   })

(def catalogs-hotel-item-error-response-spec
  (ds/spec
    {:name ::catalogs-hotel-item-error-response
     :spec catalogs-hotel-item-error-response-data}))
