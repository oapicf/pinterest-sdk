(ns pinterest-rest-api.specs.ads-analytics
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ads-analytics-data
  {
   (ds/req :AD_ID) string?
   (ds/opt :DATE) inst?
   })

(def ads-analytics-spec
  (ds/spec
    {:name ::ads-analytics
     :spec ads-analytics-data}))
