(ns pinterest-rest-api.specs.catalogs-local-stores-create-200-response-inner-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.pinterest/lib/error :refer :all]
            )
  (:import (java.io File)))


(def catalogs-local-stores-create-200-response-inner-data-data
  {
   (ds/opt :address_primary) string?
   (ds/opt :address_secondary) string?
   (ds/opt :city) string?
   (ds/req :country) country-spec
   (ds/req :created_at) inst?
   (ds/req :id) string?
   (ds/opt :latitude) float?
   (ds/opt :longitude) float?
   (ds/req :name) string?
   (ds/opt :postal_code) string?
   (ds/opt :region) string?
   (ds/req :store_code) string?
   (ds/req :updated_at) inst?
   (ds/req :exceptions) pinterest/lib/error-spec
   })

(def catalogs-local-stores-create-200-response-inner-data-spec
  (ds/spec
    {:name ::catalogs-local-stores-create-200-response-inner-data
     :spec catalogs-local-stores-create-200-response-inner-data-data}))
