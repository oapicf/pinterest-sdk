(ns pinterest-rest-api.specs.ad-pin-analytics
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-pin-analytics-data
  {
   (ds/opt :DATE) inst?
   (ds/req :PIN_ID) string?
   })

(def ad-pin-analytics-spec
  (ds/spec
    {:name ::ad-pin-analytics
     :spec ad-pin-analytics-data}))
