(ns pinterest-rest-api.specs.local-store-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            )
  (:import (java.io File)))


(def local-store-create-data
  {
   (ds/opt :address_primary) string?
   (ds/opt :address_secondary) string?
   (ds/opt :city) string?
   (ds/req :country) country-spec
   (ds/opt :latitude) float?
   (ds/opt :longitude) float?
   (ds/req :name) string?
   (ds/opt :postal_code) string?
   (ds/opt :region) string?
   (ds/req :store_code) string?
   })

(def local-store-create-spec
  (ds/spec
    {:name ::local-store-create
     :spec local-store-create-data}))
