(ns pinterest-rest-api.specs.reporting-column-sync
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def reporting-column-sync-data
  {
   })

(def reporting-column-sync-spec
  (ds/spec
    {:name ::reporting-column-sync
     :spec reporting-column-sync-data}))
