(ns pinterest-rest-api.specs.schedule-action
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def schedule-action-data
  {
   })

(def schedule-action-spec
  (ds/spec
    {:name ::schedule-action
     :spec schedule-action-data}))
