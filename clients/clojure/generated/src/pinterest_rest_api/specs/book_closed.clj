(ns pinterest-rest-api.specs.book-closed
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def book-closed-data
  {
   (ds/req :conversion_metrics_ready) boolean?
   (ds/req :non_conversion_metrics_ready) boolean?
   })

(def book-closed-spec
  (ds/spec
    {:name ::book-closed
     :spec book-closed-data}))
