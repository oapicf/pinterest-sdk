(ns pinterest-rest-api.specs.reporting-column-async
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def reporting-column-async-data
  {
   })

(def reporting-column-async-spec
  (ds/spec
    {:name ::reporting-column-async
     :spec reporting-column-async-data}))
