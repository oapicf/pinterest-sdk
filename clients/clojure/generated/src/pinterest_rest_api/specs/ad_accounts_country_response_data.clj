(ns pinterest-rest-api.specs.ad-accounts-country-response-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ad-country :refer :all]
            )
  (:import (java.io File)))


(def ad-accounts-country-response-data-data
  {
   (ds/opt :code) ad-country-spec
   (ds/opt :currency) string?
   (ds/opt :index) float?
   (ds/opt :name) string?
   })

(def ad-accounts-country-response-data-spec
  (ds/spec
    {:name ::ad-accounts-country-response-data
     :spec ad-accounts-country-response-data-data}))
