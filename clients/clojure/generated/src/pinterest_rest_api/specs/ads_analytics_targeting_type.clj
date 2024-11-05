(ns pinterest-rest-api.specs.ads-analytics-targeting-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ads-analytics-targeting-type-data
  {
   })

(def ads-analytics-targeting-type-spec
  (ds/spec
    {:name ::ads-analytics-targeting-type
     :spec ads-analytics-targeting-type-data}))
