(ns pinterest-rest-api.specs.schedule-audience-multipliers
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def schedule-audience-multipliers-data
  {
   (ds/opt :AUDIENCE_ID) string?
   })

(def schedule-audience-multipliers-spec
  (ds/spec
    {:name ::schedule-audience-multipliers
     :spec schedule-audience-multipliers-data}))
