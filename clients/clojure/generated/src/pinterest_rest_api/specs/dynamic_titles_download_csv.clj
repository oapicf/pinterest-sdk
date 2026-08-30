(ns pinterest-rest-api.specs.dynamic-titles-download-csv
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def dynamic-titles-download-csv-data
  {
   (ds/opt :download_url) string?
   })

(def dynamic-titles-download-csv-spec
  (ds/spec
    {:name ::dynamic-titles-download-csv
     :spec dynamic-titles-download-csv-data}))
