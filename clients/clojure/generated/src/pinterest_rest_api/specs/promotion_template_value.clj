(ns pinterest-rest-api.specs.promotion-template-value
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.currency :refer :all]
            )
  (:import (java.io File)))


(def promotion-template-value-data
  {
   (ds/opt :amount) float?
   (ds/opt :currency_code) currency-spec
   (ds/opt :custom_text) string?
   (ds/opt :percent) float?
   })

(def promotion-template-value-spec
  (ds/spec
    {:name ::promotion-template-value
     :spec promotion-template-value-data}))
