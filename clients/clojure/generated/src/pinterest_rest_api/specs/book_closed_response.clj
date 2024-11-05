(ns pinterest-rest-api.specs.book-closed-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def book-closed-response-data
  {
   (ds/opt :conversion_metrics_ready) boolean?
   (ds/opt :non_conversion_metrics_ready) boolean?
   })

(def book-closed-response-spec
  (ds/spec
    {:name ::book-closed-response
     :spec book-closed-response-data}))
