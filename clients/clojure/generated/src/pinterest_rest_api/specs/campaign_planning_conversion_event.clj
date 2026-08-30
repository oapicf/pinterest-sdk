(ns pinterest-rest-api.specs.campaign-planning-conversion-event
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def campaign-planning-conversion-event-data
  {
   })

(def campaign-planning-conversion-event-spec
  (ds/spec
    {:name ::campaign-planning-conversion-event
     :spec campaign-planning-conversion-event-data}))
