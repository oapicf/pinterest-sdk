(ns pinterest-rest-api.specs.mmm-reporting-targeting-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def mmm-reporting-targeting-type-data
  {
   })

(def mmm-reporting-targeting-type-spec
  (ds/spec
    {:name ::mmm-reporting-targeting-type
     :spec mmm-reporting-targeting-type-data}))
