(ns pinterest-rest-api.specs.app-type-multipliers
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.targeting-spec-app-type :refer :all]
            )
  (:import (java.io File)))


(def app-type-multipliers-data
  {
   (ds/opt :APP_TYPE) targeting-spec-app-type-spec
   })

(def app-type-multipliers-spec
  (ds/spec
    {:name ::app-type-multipliers
     :spec app-type-multipliers-data}))
