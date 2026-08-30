(ns pinterest-rest-api.specs.audience-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audience-status-data
  {
   })

(def audience-status-spec
  (ds/spec
    {:name ::audience-status
     :spec audience-status-data}))
