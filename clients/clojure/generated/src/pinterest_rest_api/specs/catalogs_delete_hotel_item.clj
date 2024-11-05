(ns pinterest-rest-api.specs.catalogs-delete-hotel-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-delete-hotel-item-data
  {
   (ds/req :hotel_id) string?
   (ds/req :operation) string?
   })

(def catalogs-delete-hotel-item-spec
  (ds/spec
    {:name ::catalogs-delete-hotel-item
     :spec catalogs-delete-hotel-item-data}))
