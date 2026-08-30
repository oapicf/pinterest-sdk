(ns pinterest-rest-api.specs.ad-accounts-country
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            )
  (:import (java.io File)))


(def ad-accounts-country-data
  {
   (ds/req :code) country-spec
   (ds/req :currency) string?
   (ds/req :index) float?
   (ds/req :name) string?
   })

(def ad-accounts-country-spec
  (ds/spec
    {:name ::ad-accounts-country
     :spec ad-accounts-country-data}))
