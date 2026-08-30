(ns pinterest-rest-api.specs.video-pin-metric-types
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def video-pin-metric-types-data
  {
   })

(def video-pin-metric-types-spec
  (ds/spec
    {:name ::video-pin-metric-types
     :spec video-pin-metric-types-data}))
