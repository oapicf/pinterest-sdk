(ns pinterest-rest-api.specs.catalogs-updatable-hotel-attributes
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-hotel-address :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-guest-ratings :refer :all]
            )
  (:import (java.io File)))


(def catalogs-updatable-hotel-attributes-data
  {
   (ds/opt :name) string?
   (ds/opt :link) string?
   (ds/opt :description) string?
   (ds/opt :brand) string?
   (ds/opt :latitude) float?
   (ds/opt :longitude) float?
   (ds/opt :neighborhood) (s/coll-of string?)
   (ds/opt :address) catalogs-hotel-address-spec
   (ds/opt :custom_label_0) string?
   (ds/opt :custom_label_1) string?
   (ds/opt :custom_label_2) string?
   (ds/opt :custom_label_3) string?
   (ds/opt :custom_label_4) string?
   (ds/opt :category) string?
   (ds/opt :base_price) string?
   (ds/opt :sale_price) string?
   (ds/opt :guest_ratings) catalogs-hotel-guest-ratings-spec
   })

(def catalogs-updatable-hotel-attributes-spec
  (ds/spec
    {:name ::catalogs-updatable-hotel-attributes
     :spec catalogs-updatable-hotel-attributes-data}))
