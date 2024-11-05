(ns pinterest-rest-api.specs.targeting-advertiser-country
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def targeting-advertiser-country-data
  {
   })

(def targeting-advertiser-country-spec
  (ds/spec
    {:name ::targeting-advertiser-country
     :spec targeting-advertiser-country-data}))
