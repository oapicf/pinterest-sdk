(ns pinterest-rest-api.specs.conversion-health-selection-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def conversion-health-selection-item-data
  {
   (ds/opt :conversionType) any?
   (ds/opt :criteria) any?
   (ds/opt :ingestionSource) any?
   (ds/req :status) any-type-spec
   })

(def conversion-health-selection-item-spec
  (ds/spec
    {:name ::conversion-health-selection-item
     :spec conversion-health-selection-item-data}))
