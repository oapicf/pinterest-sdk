(ns pinterest-rest-api.specs.ads-analytics-response-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ads-analytics-response-inner-data
  {
   (ds/req :AD_ID) string?
   (ds/opt :DATE) inst?
   })

(def ads-analytics-response-inner-spec
  (ds/spec
    {:name ::ads-analytics-response-inner
     :spec ads-analytics-response-inner-data}))
