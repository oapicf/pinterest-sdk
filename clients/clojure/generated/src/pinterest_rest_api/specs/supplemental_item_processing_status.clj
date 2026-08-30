(ns pinterest-rest-api.specs.supplemental-item-processing-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def supplemental-item-processing-status-data
  {
   })

(def supplemental-item-processing-status-spec
  (ds/spec
    {:name ::supplemental-item-processing-status
     :spec supplemental-item-processing-status-data}))
