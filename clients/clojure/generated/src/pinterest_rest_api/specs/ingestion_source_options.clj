(ns pinterest-rest-api.specs.ingestion-source-options
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ingestion-source-options-data
  {
   })

(def ingestion-source-options-spec
  (ds/spec
    {:name ::ingestion-source-options
     :spec ingestion-source-options-data}))
