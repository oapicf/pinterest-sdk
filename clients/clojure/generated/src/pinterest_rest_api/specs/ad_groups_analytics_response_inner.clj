(ns pinterest-rest-api.specs.ad-groups-analytics-response-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-groups-analytics-response-inner-data
  {
   (ds/req :AD_GROUP_ID) string?
   (ds/opt :DATE) inst?
   })

(def ad-groups-analytics-response-inner-spec
  (ds/spec
    {:name ::ad-groups-analytics-response-inner
     :spec ad-groups-analytics-response-inner-data}))
