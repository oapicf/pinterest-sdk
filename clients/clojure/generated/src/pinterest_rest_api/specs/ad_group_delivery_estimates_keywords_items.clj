(ns pinterest-rest-api.specs.ad-group-delivery-estimates-keywords-items
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.nullalble-match-type :refer :all]
            )
  (:import (java.io File)))


(def ad-group-delivery-estimates-keywords-items-data
  {
   (ds/req :match_type) nullalble-match-type-spec
   (ds/req :value) string?
   })

(def ad-group-delivery-estimates-keywords-items-spec
  (ds/spec
    {:name ::ad-group-delivery-estimates-keywords-items
     :spec ad-group-delivery-estimates-keywords-items-data}))
