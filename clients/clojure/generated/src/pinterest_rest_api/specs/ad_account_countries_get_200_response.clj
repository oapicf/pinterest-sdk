(ns pinterest-rest-api.specs.ad-account-countries-get-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ad-accounts-country :refer :all]
            )
  (:import (java.io File)))


(def ad-account-countries-get-200-response-data
  {
   (ds/req :items) (s/coll-of ad-accounts-country-spec)
   })

(def ad-account-countries-get-200-response-spec
  (ds/spec
    {:name ::ad-account-countries-get-200-response
     :spec ad-account-countries-get-200-response-data}))
