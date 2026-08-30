(ns pinterest-rest-api.specs.schedule-app-type-multipliers
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.targeting-spec-app-type :refer :all]
            )
  (:import (java.io File)))


(def schedule-app-type-multipliers-data
  {
   (ds/opt :APP_TYPE) targeting-spec-app-type-spec
   })

(def schedule-app-type-multipliers-spec
  (ds/spec
    {:name ::schedule-app-type-multipliers
     :spec schedule-app-type-multipliers-data}))
