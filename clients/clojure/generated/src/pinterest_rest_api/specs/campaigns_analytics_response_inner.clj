(ns pinterest-rest-api.specs.campaigns-analytics-response-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def campaigns-analytics-response-inner-data
  {
   (ds/req :CAMPAIGN_ID) string?
   (ds/opt :DATE) inst?
   })

(def campaigns-analytics-response-inner-spec
  (ds/spec
    {:name ::campaigns-analytics-response-inner
     :spec campaigns-analytics-response-inner-data}))
