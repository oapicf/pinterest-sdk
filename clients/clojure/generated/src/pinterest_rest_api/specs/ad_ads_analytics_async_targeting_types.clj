(ns pinterest-rest-api.specs.ad-ads-analytics-async-targeting-types
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-ads-analytics-async-targeting-types-data
  {
   })

(def ad-ads-analytics-async-targeting-types-spec
  (ds/spec
    {:name ::ad-ads-analytics-async-targeting-types
     :spec ad-ads-analytics-async-targeting-types-data}))
