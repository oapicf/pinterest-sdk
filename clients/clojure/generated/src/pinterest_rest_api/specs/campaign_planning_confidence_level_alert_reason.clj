(ns pinterest-rest-api.specs.campaign-planning-confidence-level-alert-reason
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def campaign-planning-confidence-level-alert-reason-data
  {
   })

(def campaign-planning-confidence-level-alert-reason-spec
  (ds/spec
    {:name ::campaign-planning-confidence-level-alert-reason
     :spec campaign-planning-confidence-level-alert-reason-data}))
