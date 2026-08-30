(ns pinterest-rest-api.specs.msot-event-name
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def msot-event-name-data
  {
   })

(def msot-event-name-spec
  (ds/spec
    {:name ::msot-event-name
     :spec msot-event-name-data}))
