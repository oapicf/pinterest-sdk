(ns pinterest-rest-api.specs.integration-log-event-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def integration-log-event-type-data
  {
   })

(def integration-log-event-type-spec
  (ds/spec
    {:name ::integration-log-event-type
     :spec integration-log-event-type-data}))
