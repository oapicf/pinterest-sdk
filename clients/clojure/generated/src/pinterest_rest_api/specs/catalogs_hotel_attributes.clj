(ns pinterest-rest-api.specs.catalogs-hotel-attributes
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-hotel-address :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-guest-ratings :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-attributes-all-of-main-image :refer :all]
            )
  (:import (java.io File)))


(def catalogs-hotel-attributes-data
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
   (ds/opt :main_image) catalogs-hotel-attributes-all-of-main-image-spec
   (ds/opt :additional_image_link) (s/coll-of string?)
   })

(def catalogs-hotel-attributes-spec
  (ds/spec
    {:name ::catalogs-hotel-attributes
     :spec catalogs-hotel-attributes-data}))
