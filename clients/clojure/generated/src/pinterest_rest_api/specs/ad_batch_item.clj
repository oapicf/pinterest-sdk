(ns pinterest-rest-api.specs.ad-batch-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ad :refer :all]
            [pinterest-rest-api.specs.pinterest/lib/error :refer :all]
            )
  (:import (java.io File)))


(def ad-batch-item-data
  {
   (ds/opt :data) ad-spec
   (ds/opt :exceptions) pinterest/lib/error-spec
   })

(def ad-batch-item-spec
  (ds/spec
    {:name ::ad-batch-item
     :spec ad-batch-item-data}))
