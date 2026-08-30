(ns pinterest-rest-api.specs.ad-groups-create-200-response-items-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ad-group :refer :all]
            [pinterest-rest-api.specs.pinterest/lib/batch-item-exception :refer :all]
            )
  (:import (java.io File)))


(def ad-groups-create-200-response-items-inner-data
  {
   (ds/opt :data) ad-group-spec
   (ds/opt :exceptions) (s/coll-of pinterest/lib/batch-item-exception-spec)
   })

(def ad-groups-create-200-response-items-inner-spec
  (ds/spec
    {:name ::ad-groups-create-200-response-items-inner
     :spec ad-groups-create-200-response-items-inner-data}))
