(ns pinterest-rest-api.specs.bulk-campaign-delivery-estimates-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.bulk-campaign-delivery-estimates-item :refer :all]
            )
  (:import (java.io File)))


(def bulk-campaign-delivery-estimates-response-data
  {
   (ds/req :data) (s/coll-of bulk-campaign-delivery-estimates-item-spec)
   })

(def bulk-campaign-delivery-estimates-response-spec
  (ds/spec
    {:name ::bulk-campaign-delivery-estimates-response
     :spec bulk-campaign-delivery-estimates-response-data}))
