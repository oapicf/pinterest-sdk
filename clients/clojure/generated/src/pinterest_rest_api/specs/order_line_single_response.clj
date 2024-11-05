(ns pinterest-rest-api.specs.order-line-single-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def order-line-single-response-data
  {
   (ds/opt :data) order-line-response-spec
   })

(def order-line-single-response-spec
  (ds/spec
    {:name ::order-line-single-response
     :spec order-line-single-response-data}))
