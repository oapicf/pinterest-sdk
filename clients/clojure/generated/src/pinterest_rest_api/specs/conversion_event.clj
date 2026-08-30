(ns pinterest-rest-api.specs.conversion-event
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-event-data
  {
   })

(def conversion-event-spec
  (ds/spec
    {:name ::conversion-event
     :spec conversion-event-data}))
