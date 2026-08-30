(ns pinterest-rest-api.specs.summary-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def summary-status-data
  {
   })

(def summary-status-spec
  (ds/spec
    {:name ::summary-status
     :spec summary-status-data}))
