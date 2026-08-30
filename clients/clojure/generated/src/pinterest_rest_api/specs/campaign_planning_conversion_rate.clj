(ns pinterest-rest-api.specs.campaign-planning-conversion-rate
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.campaign-planning-conversion-attribution :refer :all]
            [pinterest-rest-api.specs.campaign-planning-conversion-event :refer :all]
            )
  (:import (java.io File)))


(def campaign-planning-conversion-rate-data
  {
   (ds/req :attribution_windows) campaign-planning-conversion-attribution-spec
   (ds/req :conversion_event) campaign-planning-conversion-event-spec
   (ds/req :conversion_rate) float?
   })

(def campaign-planning-conversion-rate-spec
  (ds/spec
    {:name ::campaign-planning-conversion-rate
     :spec campaign-planning-conversion-rate-data}))
