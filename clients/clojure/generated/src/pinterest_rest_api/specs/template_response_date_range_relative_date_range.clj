(ns pinterest-rest-api.specs.template-response-date-range-relative-date-range
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def template-response-date-range-relative-date-range-data
  {
   (ds/opt :type) string?
   (ds/opt :start_days_in_past) float?
   (ds/opt :end_days_in_past) float?
   })

(def template-response-date-range-relative-date-range-spec
  (ds/spec
    {:name ::template-response-date-range-relative-date-range
     :spec template-response-date-range-relative-date-range-data}))
