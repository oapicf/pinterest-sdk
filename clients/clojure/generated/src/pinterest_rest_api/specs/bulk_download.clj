(ns pinterest-rest-api.specs.bulk-download
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def bulk-download-data
  {
   (ds/opt :request_id) string?
   })

(def bulk-download-spec
  (ds/spec
    {:name ::bulk-download
     :spec bulk-download-data}))
