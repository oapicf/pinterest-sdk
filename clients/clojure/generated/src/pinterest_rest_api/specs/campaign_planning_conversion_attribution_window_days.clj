(ns pinterest-rest-api.specs.campaign-planning-conversion-attribution-window-days
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def campaign-planning-conversion-attribution-window-days-data
  {
   })

(def campaign-planning-conversion-attribution-window-days-spec
  (ds/spec
    {:name ::campaign-planning-conversion-attribution-window-days
     :spec campaign-planning-conversion-attribution-window-days-data}))
