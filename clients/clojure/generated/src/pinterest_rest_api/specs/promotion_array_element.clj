(ns pinterest-rest-api.specs.promotion-array-element
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.promotion :refer :all]
            [pinterest-rest-api.specs.exception :refer :all]
            )
  (:import (java.io File)))


(def promotion-array-element-data
  {
   (ds/opt :data) promotion-spec
   (ds/opt :exception) exception-spec
   })

(def promotion-array-element-spec
  (ds/spec
    {:name ::promotion-array-element
     :spec promotion-array-element-data}))
