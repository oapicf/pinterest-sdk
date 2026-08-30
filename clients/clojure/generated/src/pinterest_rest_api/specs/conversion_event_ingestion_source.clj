(ns pinterest-rest-api.specs.conversion-event-ingestion-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-event-ingestion-source-data
  {
   })

(def conversion-event-ingestion-source-spec
  (ds/spec
    {:name ::conversion-event-ingestion-source
     :spec conversion-event-ingestion-source-data}))
