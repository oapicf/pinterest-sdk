(ns pinterest-rest-api.specs.campaign-planning-confidence-level-alert-severity
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def campaign-planning-confidence-level-alert-severity-data
  {
   })

(def campaign-planning-confidence-level-alert-severity-spec
  (ds/spec
    {:name ::campaign-planning-confidence-level-alert-severity
     :spec campaign-planning-confidence-level-alert-severity-data}))
