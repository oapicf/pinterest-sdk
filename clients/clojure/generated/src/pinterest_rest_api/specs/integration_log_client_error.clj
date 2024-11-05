(ns pinterest-rest-api.specs.integration-log-client-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def integration-log-client-error-data
  {
   (ds/opt :cause) string?
   (ds/opt :column_number) int?
   (ds/opt :file_name) string?
   (ds/opt :line_number) int?
   (ds/opt :message) string?
   (ds/opt :message_detail) string?
   (ds/opt :name) string?
   (ds/opt :number) int?
   (ds/opt :stack_trace) string?
   })

(def integration-log-client-error-spec
  (ds/spec
    {:name ::integration-log-client-error
     :spec integration-log-client-error-data}))
