(ns pinterest-rest-api.specs.ads-analytics-account-targeting-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ads-analytics-account-targeting-type-data
  {
   })

(def ads-analytics-account-targeting-type-spec
  (ds/spec
    {:name ::ads-analytics-account-targeting-type
     :spec ads-analytics-account-targeting-type-data}))
