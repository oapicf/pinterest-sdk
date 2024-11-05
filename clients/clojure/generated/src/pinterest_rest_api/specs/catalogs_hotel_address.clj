(ns pinterest-rest-api.specs.catalogs-hotel-address
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-hotel-address-data
  {
   (ds/opt :addr1) string?
   (ds/opt :city) string?
   (ds/opt :region) string?
   (ds/opt :country) string?
   (ds/opt :postal_code) string?
   })

(def catalogs-hotel-address-spec
  (ds/spec
    {:name ::catalogs-hotel-address
     :spec catalogs-hotel-address-data}))
