(ns pinterest-rest-api.specs.app-type-multipliers
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def app-type-multipliers-data
  {
   (ds/opt :APP_TYPE) string?
   })

(def app-type-multipliers-spec
  (ds/spec
    {:name ::app-type-multipliers
     :spec app-type-multipliers-data}))
