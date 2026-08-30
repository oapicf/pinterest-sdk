(ns pinterest-rest-api.specs.integration-log-level
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def integration-log-level-data
  {
   })

(def integration-log-level-spec
  (ds/spec
    {:name ::integration-log-level
     :spec integration-log-level-data}))
