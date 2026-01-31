(ns pinterest-rest-api.specs.overall-status-options
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def overall-status-options-data
  {
   })

(def overall-status-options-spec
  (ds/spec
    {:name ::overall-status-options
     :spec overall-status-options-data}))
