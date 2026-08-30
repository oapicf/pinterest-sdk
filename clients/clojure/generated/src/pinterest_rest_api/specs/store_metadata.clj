(ns pinterest-rest-api.specs.store-metadata
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def store-metadata-data
  {
   (ds/opt :geohash) string?
   (ds/opt :latitude) float?
   (ds/opt :longitude) float?
   (ds/req :store_code) string?
   (ds/req :store_id) string?
   (ds/opt :store_name) string?
   })

(def store-metadata-spec
  (ds/spec
    {:name ::store-metadata
     :spec store-metadata-data}))
