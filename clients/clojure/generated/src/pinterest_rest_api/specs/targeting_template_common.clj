(ns pinterest-rest-api.specs.targeting-template-common
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.targeting-spec :refer :all]
            [pinterest-rest-api.specs.placement-group-type :refer :all]
            [pinterest-rest-api.specs.targeting-template-keyword :refer :all]
            [pinterest-rest-api.specs.tracking-urls :refer :all]
            )
  (:import (java.io File)))


(def targeting-template-common-data
  {
   (ds/opt :name) string?
   (ds/opt :auto_targeting_enabled) boolean?
   (ds/opt :targeting_attributes) targeting-spec-spec
   (ds/opt :placement_group) placement-group-type-spec
   (ds/opt :keywords) (s/coll-of targeting-template-keyword-spec)
   (ds/opt :tracking_urls) tracking-urls-spec
   })

(def targeting-template-common-spec
  (ds/spec
    {:name ::targeting-template-common
     :spec targeting-template-common-data}))
