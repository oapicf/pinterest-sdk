(ns pinterest-rest-api.specs.promotions-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.promotion-array-element :refer :all]
            )
  (:import (java.io File)))


(def promotions-response-data
  {
   (ds/opt :promotions) (s/coll-of promotion-array-element-spec)
   })

(def promotions-response-spec
  (ds/spec
    {:name ::promotions-response
     :spec promotions-response-data}))
