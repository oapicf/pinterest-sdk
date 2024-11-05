(ns pinterest-rest-api.specs.catalogs-feed-processing-schedule
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-feed-processing-schedule-data
  {
   (ds/req :time) string?
   (ds/req :timezone) string?
   })

(def catalogs-feed-processing-schedule-spec
  (ds/spec
    {:name ::catalogs-feed-processing-schedule
     :spec catalogs-feed-processing-schedule-data}))
