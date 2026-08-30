(ns pinterest-rest-api.specs.label-status-bulk-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def label-status-bulk-update-data
  {
   })

(def label-status-bulk-update-spec
  (ds/spec
    {:name ::label-status-bulk-update
     :spec label-status-bulk-update-data}))
