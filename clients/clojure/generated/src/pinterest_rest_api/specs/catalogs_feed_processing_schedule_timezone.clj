(ns pinterest-rest-api.specs.catalogs-feed-processing-schedule-timezone
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-feed-processing-schedule-timezone-data
  {
   })

(def catalogs-feed-processing-schedule-timezone-spec
  (ds/spec
    {:name ::catalogs-feed-processing-schedule-timezone
     :spec catalogs-feed-processing-schedule-timezone-data}))
