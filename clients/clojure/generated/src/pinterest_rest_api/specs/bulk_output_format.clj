(ns pinterest-rest-api.specs.bulk-output-format
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def bulk-output-format-data
  {
   })

(def bulk-output-format-spec
  (ds/spec
    {:name ::bulk-output-format
     :spec bulk-output-format-data}))
