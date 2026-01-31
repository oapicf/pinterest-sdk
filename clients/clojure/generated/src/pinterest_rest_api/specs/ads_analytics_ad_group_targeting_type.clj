(ns pinterest-rest-api.specs.ads-analytics-ad-group-targeting-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ads-analytics-ad-group-targeting-type-data
  {
   })

(def ads-analytics-ad-group-targeting-type-spec
  (ds/spec
    {:name ::ads-analytics-ad-group-targeting-type
     :spec ads-analytics-ad-group-targeting-type-data}))
