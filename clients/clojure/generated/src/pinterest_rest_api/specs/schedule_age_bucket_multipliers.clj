(ns pinterest-rest-api.specs.schedule-age-bucket-multipliers
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def schedule-age-bucket-multipliers-data
  {
   (ds/opt :AGE_BUCKET) string?
   })

(def schedule-age-bucket-multipliers-spec
  (ds/spec
    {:name ::schedule-age-bucket-multipliers
     :spec schedule-age-bucket-multipliers-data}))
