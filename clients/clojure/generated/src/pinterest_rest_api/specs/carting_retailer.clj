(ns pinterest-rest-api.specs.carting-retailer
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def carting-retailer-data
  {
   (ds/req :retailer_id) string?
   (ds/req :retailer_name) string?
   })

(def carting-retailer-spec
  (ds/spec
    {:name ::carting-retailer
     :spec carting-retailer-data}))
