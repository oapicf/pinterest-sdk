(ns pinterest-rest-api.specs.targeting-template-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.targeting-spec :refer :all]
            [pinterest-rest-api.specs.placement-group-type :refer :all]
            [pinterest-rest-api.specs.targeting-template-keyword :refer :all]
            [pinterest-rest-api.specs.tracking-urls :refer :all]
            )
  (:import (java.io File)))


(def targeting-template-create-data
  {
   (ds/req :name) string?
   (ds/opt :auto_targeting_enabled) boolean?
   (ds/req :targeting_attributes) targeting-spec-spec
   (ds/opt :placement_group) placement-group-type-spec
   (ds/opt :keywords) (s/coll-of targeting-template-keyword-spec)
   (ds/opt :tracking_urls) tracking-urls-spec
   })

(def targeting-template-create-spec
  (ds/spec
    {:name ::targeting-template-create
     :spec targeting-template-create-data}))
