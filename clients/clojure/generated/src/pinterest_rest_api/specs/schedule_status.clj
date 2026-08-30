(ns pinterest-rest-api.specs.schedule-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def schedule-status-data
  {
   })

(def schedule-status-spec
  (ds/spec
    {:name ::schedule-status
     :spec schedule-status-data}))
