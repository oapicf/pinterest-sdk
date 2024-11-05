(ns pinterest-rest-api.specs.conversion-report-attribution-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-report-attribution-type-data
  {
   })

(def conversion-report-attribution-type-spec
  (ds/spec
    {:name ::conversion-report-attribution-type
     :spec conversion-report-attribution-type-data}))
