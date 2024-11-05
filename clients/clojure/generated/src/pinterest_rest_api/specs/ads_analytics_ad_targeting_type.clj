(ns pinterest-rest-api.specs.ads-analytics-ad-targeting-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ads-analytics-ad-targeting-type-data
  {
   })

(def ads-analytics-ad-targeting-type-spec
  (ds/spec
    {:name ::ads-analytics-ad-targeting-type
     :spec ads-analytics-ad-targeting-type-data}))
