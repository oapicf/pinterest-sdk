(ns pinterest-rest-api.specs.template-response-date-range-absolute-date-range
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def template-response-date-range-absolute-date-range-data
  {
   (ds/opt :type) string?
   (ds/opt :start_date) float?
   (ds/opt :end_date) float?
   })

(def template-response-date-range-absolute-date-range-spec
  (ds/spec
    {:name ::template-response-date-range-absolute-date-range
     :spec template-response-date-range-absolute-date-range-data}))
