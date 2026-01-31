(ns pinterest-rest-api.specs.local-store-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            )
  (:import (java.io File)))


(def local-store-update-data
  {
   (ds/opt :address_primary) string?
   (ds/opt :address_secondary) string?
   (ds/opt :city) string?
   (ds/opt :country) country-spec
   (ds/req :id) string?
   (ds/opt :latitude) float?
   (ds/opt :longitude) float?
   (ds/opt :name) string?
   (ds/opt :postal_code) string?
   (ds/opt :region) string?
   (ds/opt :store_code) string?
   })

(def local-store-update-spec
  (ds/spec
    {:name ::local-store-update
     :spec local-store-update-data}))
