(ns pinterest-rest-api.specs.ad-groups-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ad-group-response :refer :all]
            )
  (:import (java.io File)))


(def ad-groups-list-200-response-data
  {
   (ds/req :items) (s/coll-of ad-group-response-spec)
   (ds/opt :bookmark) string?
   })

(def ad-groups-list-200-response-spec
  (ds/spec
    {:name ::ad-groups-list-200-response
     :spec ad-groups-list-200-response-data}))
