(ns pinterest-rest-api.specs.ad-groups-create-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ad-groups-create-200-response-items-inner :refer :all]
            )
  (:import (java.io File)))


(def ad-groups-create-200-response-data
  {
   (ds/req :items) (s/coll-of ad-groups-create-200-response-items-inner-spec)
   })

(def ad-groups-create-200-response-spec
  (ds/spec
    {:name ::ad-groups-create-200-response
     :spec ad-groups-create-200-response-data}))
