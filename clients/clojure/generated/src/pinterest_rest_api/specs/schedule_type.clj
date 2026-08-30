(ns pinterest-rest-api.specs.schedule-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def schedule-type-data
  {
   })

(def schedule-type-spec
  (ds/spec
    {:name ::schedule-type
     :spec schedule-type-data}))
