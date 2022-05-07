(ns pinterest-rest-api.specs.item-processing-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def item-processing-status-data
  {
   })

(def item-processing-status-spec
  (ds/spec
    {:name ::item-processing-status
     :spec item-processing-status-data}))
