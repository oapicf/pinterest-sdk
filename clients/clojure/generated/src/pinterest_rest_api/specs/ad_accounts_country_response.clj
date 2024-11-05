(ns pinterest-rest-api.specs.ad-accounts-country-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ad-accounts-country-response-data :refer :all]
            )
  (:import (java.io File)))


(def ad-accounts-country-response-data
  {
   (ds/opt :items) (s/coll-of ad-accounts-country-response-data-spec)
   })

(def ad-accounts-country-response-spec
  (ds/spec
    {:name ::ad-accounts-country-response
     :spec ad-accounts-country-response-data}))
