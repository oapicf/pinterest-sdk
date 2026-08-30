(ns pinterest-rest-api.specs.ingestion-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ingestion-source-data
  {
   })

(def ingestion-source-spec
  (ds/spec
    {:name ::ingestion-source
     :spec ingestion-source-data}))
