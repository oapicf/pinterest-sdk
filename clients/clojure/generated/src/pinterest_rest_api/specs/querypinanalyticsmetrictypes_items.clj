(ns pinterest-rest-api.specs.querypinanalyticsmetrictypes-items
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def querypinanalyticsmetrictypes-items-data
  {
   })

(def querypinanalyticsmetrictypes-items-spec
  (ds/spec
    {:name ::querypinanalyticsmetrictypes-items
     :spec querypinanalyticsmetrictypes-items-data}))
