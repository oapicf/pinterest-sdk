(ns pinterest-rest-api.specs.catalogs-hotel-attributes-all-of-main-image
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-hotel-attributes-all-of-main-image-data
  {
   (ds/opt :link) string?
   (ds/opt :tag) (s/coll-of string?)
   })

(def catalogs-hotel-attributes-all-of-main-image-spec
  (ds/spec
    {:name ::catalogs-hotel-attributes-all-of-main-image
     :spec catalogs-hotel-attributes-all-of-main-image-data}))
