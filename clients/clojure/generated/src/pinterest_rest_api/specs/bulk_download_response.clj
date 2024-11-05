(ns pinterest-rest-api.specs.bulk-download-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def bulk-download-response-data
  {
   (ds/opt :request_id) string?
   })

(def bulk-download-response-spec
  (ds/spec
    {:name ::bulk-download-response
     :spec bulk-download-response-data}))
