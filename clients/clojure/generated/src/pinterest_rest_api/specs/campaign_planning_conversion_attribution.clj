(ns pinterest-rest-api.specs.campaign-planning-conversion-attribution
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.campaign-planning-conversion-attribution-window-days :refer :all]
            [pinterest-rest-api.specs.campaign-planning-conversion-attribution-window-days :refer :all]
            [pinterest-rest-api.specs.campaign-planning-conversion-attribution-window-days :refer :all]
            )
  (:import (java.io File)))


(def campaign-planning-conversion-attribution-data
  {
   (ds/opt :click_window_days) campaign-planning-conversion-attribution-window-days-spec
   (ds/opt :engagement_window_days) campaign-planning-conversion-attribution-window-days-spec
   (ds/opt :view_window_days) campaign-planning-conversion-attribution-window-days-spec
   })

(def campaign-planning-conversion-attribution-spec
  (ds/spec
    {:name ::campaign-planning-conversion-attribution
     :spec campaign-planning-conversion-attribution-data}))
