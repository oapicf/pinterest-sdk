(ns pinterest-rest-api.specs.catalogs-hotel-main-image
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-hotel-main-image-data
  {
   (ds/opt :link) string?
   (ds/opt :tag) (s/coll-of string?)
   })

(def catalogs-hotel-main-image-spec
  (ds/spec
    {:name ::catalogs-hotel-main-image
     :spec catalogs-hotel-main-image-data}))
