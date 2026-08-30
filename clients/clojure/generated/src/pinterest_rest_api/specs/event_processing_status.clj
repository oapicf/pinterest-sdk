(ns pinterest-rest-api.specs.event-processing-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def event-processing-status-data
  {
   })

(def event-processing-status-spec
  (ds/spec
    {:name ::event-processing-status
     :spec event-processing-status-data}))
