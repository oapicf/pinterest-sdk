(ns pinterest-rest-api.specs.ads-credits-discounts-get-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ads-credit-discounts-response :refer :all]
            )
  (:import (java.io File)))


(def ads-credits-discounts-get-200-response-data
  {
   (ds/req :items) (s/coll-of ads-credit-discounts-response-spec)
   (ds/opt :bookmark) string?
   })

(def ads-credits-discounts-get-200-response-spec
  (ds/spec
    {:name ::ads-credits-discounts-get-200-response
     :spec ads-credits-discounts-get-200-response-data}))
