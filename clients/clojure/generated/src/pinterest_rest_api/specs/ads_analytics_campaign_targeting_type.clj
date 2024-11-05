(ns pinterest-rest-api.specs.ads-analytics-campaign-targeting-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ads-analytics-campaign-targeting-type-data
  {
   })

(def ads-analytics-campaign-targeting-type-spec
  (ds/spec
    {:name ::ads-analytics-campaign-targeting-type
     :spec ads-analytics-campaign-targeting-type-data}))
