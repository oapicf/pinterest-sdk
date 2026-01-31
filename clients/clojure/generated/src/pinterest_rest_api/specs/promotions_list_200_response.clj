(ns pinterest-rest-api.specs.promotions-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.promotion-response :refer :all]
            )
  (:import (java.io File)))


(def promotions-list-200-response-data
  {
   (ds/opt :bookmark) string?
   (ds/req :items) (s/coll-of promotion-response-spec)
   })

(def promotions-list-200-response-spec
  (ds/spec
    {:name ::promotions-list-200-response
     :spec promotions-list-200-response-data}))
