(ns pinterest-rest-api.specs.campaign-planning-confidence-level-alert
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.campaign-planning-confidence-level-alert-reason :refer :all]
            [pinterest-rest-api.specs.campaign-planning-confidence-level-alert-severity :refer :all]
            )
  (:import (java.io File)))


(def campaign-planning-confidence-level-alert-data
  {
   (ds/opt :description) string?
   (ds/opt :reason) campaign-planning-confidence-level-alert-reason-spec
   (ds/opt :severity) campaign-planning-confidence-level-alert-severity-spec
   })

(def campaign-planning-confidence-level-alert-spec
  (ds/spec
    {:name ::campaign-planning-confidence-level-alert
     :spec campaign-planning-confidence-level-alert-data}))
